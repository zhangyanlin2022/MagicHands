package pa.magichands.demo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import magichands.core.ExposingApi
import magichands.core.ExposingApi.sw
import magichands.core.env
import magichands.core.env.Rt
import magichands.core.handler.handler.one
import magichands.core.handler.handler.three
import magichands.core.handler.handler.two


class MainActivity : AppCompatActivity() {
    var setContentView: Handler = one
    var toast: Handler = two
    var windows: Handler = three

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        env.init(this, this::class.java.name)
        ExposingApi.requestFloatWindowPermission(this)
        if (Settings.canDrawOverlays(this)) {
            sw()
        } else {
            println("未授权")
        }

        val b: Button = findViewById(R.id.t1)
        b.setOnClickListener {
            env.start(true)
        }
        val c: Button = findViewById(R.id.t2)
        c.setOnClickListener {
            println("牛逼")
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Rt(requestCode, resultCode, data)
    }


}