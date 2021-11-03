# 一、概述简介

1. Gateway旨在提供一种简单而有效的方式来对API进行路由，以及提供一些强大的过滤器功能，例如：熔断、限流、重试等。
2. SpringCloud Gateway是基于WebFlux框架实现的，基于**异步非阻塞模型**，而WebFlux框架底层则使用了高性能的Reactor模式通信框架Netty。
3. 主要功能：反向代理、鉴权、流量控制、熔断、日志监控...

# 二、Gateway和Zuul区别

1. 在SpringCloud Finchley正式版之前，SpringCloud推荐的网关是Netfix提供的Zuul，H版本之后推荐Gateway网关
2. Zuul 1.X版本是基于**阻塞I/O**的API网关
3. Zuul 1.X基于Servlet2.5使用**阻塞架构**，它不支持任何长链接（如WebSocket）Zuul的设计模式和Nginx较像，每次I/O操作都是从工作线程中选择一个执行，请求线程被阻塞到工作线程完成，但是差别是Nginx用C++实现，Zuul用Java实现，而JVM本身会有第一次加载较慢的情况，使用Zuul的性能相对较差。
4. Zuul 2.X理念更先进，想基于Netty非阻塞和支持长链接，但是SpringCloud目前还没有整合。Zuul 2.X的性能较Zuul 1.X有较大提升。在性能方面，根据官网提供的基准测试，SpringCloud Gateway的RPS（每秒请求数）是Zuul的1.6倍。
5. SpringCloud Gateway建立在Spring 5、Project Reactor 和SpringBoot 2之上，使用非阻塞API。
6. SpringCloud Gateway还支持WebSocket，并且与Spring紧密继承拥有更好的开发体验。

# 三、三大核心概念

1. Route（路由）
2. Predicate（断言）
3. Filter（过滤）
