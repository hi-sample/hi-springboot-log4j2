# hi-springboot-log4j2
spring boot log4j2 demo

## 说明

hi-springboot-log4j2 是一个专注于展示如何在 Spring Boot 项目中使用 Log4j2 进行日志记录的示例项目。它的目标是帮助开发者快速理解并实施 Log4j2 与 Spring Boot 的集成，同时提供一些最佳实践和配置示例。

1. springboot项目默认加载log4j2-spring.xml文件
2. log4j2-spring.xml配置参数支持引用application.yml
3. 启用log4j2异步，提高日志性能

## version
- JDK 11
- gradle 6.9.4
- spring boot 2.7.17
- log4j2 2.17.2
- disruptor 3.4.4

## reference

- Spring Boot: Configure Log4j for Logging

  https://docs.spring.io/spring-boot/docs/2.7.17/reference/htmlsingle/#howto.logging.log4j

- Log4j: Spring Boot Support

  https://logging.apache.org/log4j/2.x/log4j-spring-boot.html

- Log4j: Asynchronous Loggers for Low-Latency Logging

  https://logging.apache.org/log4j/2.x/manual/async.html

