![xx](https://www.gitbook.com/cdn-cgi/image/width=40,dpr=2,height=40,fit=contain,format=auto/https%3A%2F%2F3811359113-files.gitbook.io%2F~%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FTp1zqphSRFbPy4XjsFak%252Ficon%252Fo071OP6bkE83SBCIMnMl%252FPyDracula.png%3Falt%3Dmedia%26token%3D1534be35-6204-465b-85c7-670f9ba49059)

### 声明：本库只允许非商业使用和学习

# Android自动化引擎 · MagicHands

> The only people who have anything to fear from free software are those whose products are worth even less. 
>
> <p align="right">——David Emery</p>

MagicHands，是一款自动化测试引擎，可以在Android7.0以上免root运行自动化脚本，使用js编写，可以编写插件来扩展功能。

![](https://img.shields.io/badge/language-java-brightgreen.svg)

## 作者的碎碎念

本库是在高三开发的当时由于写的非常匆忙代码比较乱注释也有问题，后续会优化的，现在能正常运行但是可能有些bug，欢迎提交问题,本人大二有时间修复。


## 找我

QQ:3560000009

## 支持

目前已兼容 7.0 ～ 12.0并跟进后续新系统

## 如何使用

### Step 1.初始化：

参考demo的MainActivity的初始化工作流程

### Step 2.编写Js代码并运行：

在assets文件下新建Js文件,再在Js文件新建libs文件夹存放封装好的接口，然后在Js文件下新建main.js为入口,在入口调用接口即可



### 相关API

```JavaScript
/**
获取给定节点的文本内容。
@权限 无障碍
@函数名 getText
@参数 node - 节点对象
@返回值 成功:文本内容 失败:null
@功能 获取给定节点的文本内容
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function getText(node) {
    return js.getText(node);
 }

 
/**
尝试点击节点
@权限 无障碍
@函数名 tryClick
@参数 node - 节点对象
@返回值 成功:true 失败:false
@功能 尝试点击目标节点,当传入节点无法节点会依次向上层节点进行点击尝试
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function tryClick(node){
    return js.tryClick(node)
}


/**
获取节点的父亲节点
@权限 无障碍
@函数名 getParentNode
@参数 node - 节点
@返回值 成功:节点信息 失败:null
@功能 获取当前节点的父亲节点
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function getParentNode(node){
    return js.getParentNode(node)
}


/**
获取坐标点的Rgb值
@权限 常规权限
@函数名 getRgb
@参数 b - Bit对象 @参数 x - x坐标 @参数 y - y坐标
@返回值 成功:rgb字符串 失败:null
@功能 获取指定坐标点的rgb字符串
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function getRgb(b,x,y){
    return js.getRgb(b,x,y)
}

/**
捕获屏幕
@权限 常规权限
@函数名 setUpVirtualDisplay
@功能 捕获当前界面
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function setUpVirtualDisplay(){
     js.setUpVirtualDisplay()
}

/**
获取捕获的bit对象
@权限 常规权限
@函数名 getBitmap
@返回值 成功:bit对象 失败:null
@功能 释放截图权限
@介绍 本方法为免费方法由官方开发维护
@版本 1 正常
*/
function getBitmap(){
    return js.getBitmap()
}

```

更多其他操作看在线文档:[api.js](https://magichands.gitbook.io/api-docs-1/android/jie-shao)



## 计划

 - opencv实现图色识别
 - 将要实现自动化的app加载到我们app中实现同一个进程的自动化
 - 利用蓝牙hid协议实现自动化(预计半年左右)
 - 利用android的adb提权原理实现免插数据线实现adb自动化

## 感谢

- [rhino](https://github.com/mozilla/rhino)
- [Android-Accessibility-Api](https://github.com/Vove7/Android-Accessibility-Api)

### License

> ```
> MIT License
> ```

>Copyright (c) 2023 pingan

>Permission is hereby granted, free of charge, to any person obtaining a copy
>of this software and associated documentation files (the "Software"), to deal
>in the Software without restriction, including without limitation the rights
>to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
>copies of the Software, and to permit persons to whom the Software is
>furnished to do so, subject to the following conditions:

>The above copyright notice and this permission notice shall be included in all
>copies or substantial portions of the Software.

>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
>IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
>FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
>AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
>LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
>OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
>SOFTWARE.
