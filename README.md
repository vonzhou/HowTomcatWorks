# How Tomcat Works 

## 1.一个简答的Web服务器

问题：请求HttpServer没有看到响应的内容

原因：socket输出之前要有HTTP响应头

```java
output.write("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n".getBytes());
```

## 2.一个简单的Servlet容器

面向接口编程

反射

门面模式

## 3. 连接器

使用tomcat-util RequestUtil解析请求参数和cookie

实现的Connector是Tomcat 4默认连接器的一个简化版本


## 4.Tomcat的默认连接器

HTTP 1.1 的新特性

Tomcat 4默认连接器的原理

## TODO

TODO 找一个版本的tomcat,浏览源码





---


- [Source Code](http://brainysoftware.com/source/9780975212806.zip)
- [Original Repo](https://github.com/serivires/how-tomcat-works)