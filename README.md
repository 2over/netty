# 手写RPC框架的源代码
主要实现以下几个部分:IO通信、注册中心、以及服务的提供者和消费者、以及序列化/反序列、重连机制、粘包半包问题。
## 前言
需要设置JDK环境为1.8 否则可能会启动失败
## IO部分
1.BIO如何实现以及局限性

2.NIO是如何实现高性能的、以及Netty如何解决其中的Bug的

3.AIO(暂未实现，原因是Linux是基于NIO方式实现的伪异步，只有Windows系统实现了真正意义上的AIO)

4.粘包半包问题的解决方式(分隔符、定长、换行符、消息头+消息体)

5.序列化框架(Kryo)

6.Http/Https服务器实现

## 注册中心

1.Map结构实现

## 服务提供者
1.登录机制(支持白名单)

2.超时机制(如果客户端一直未发送数据给服务端，那么就会提示读取超时)

3.心跳机制
## 服务消费者
1.连接超时机制

2.断线重连机制

3.路由机制
## 代码部分
1.Netty版本

2.Java原生版本

## 其他疑惑请移步博客相关
https://blog.csdn.net/Cover_sky/article/details/136015162
