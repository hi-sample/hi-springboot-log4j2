# hi-springboot-log4j2
springboot log4j2 demo



## version
- JDK 11
- gradle 6.9.4
- springboot 2.7.17
- log4j2 2.17.2
- disruptor 3.4.4

## reference

- Spring Boot: Configure Log4j for Logging

  https://docs.spring.io/spring-boot/docs/2.7.17/reference/htmlsingle/#howto.logging.log4j

- Log4j: Spring Boot Support

  https://logging.apache.org/log4j/2.x/log4j-spring-boot.html

- Log4j: Asynchronous Loggers for Low-Latency Logging

  https://logging.apache.org/log4j/2.x/manual/async.html

## 说明

- 本样例是spring boot集成log4j2，并且排除logback

1. springboot项目默认加载log4j2-spring.xml文件
2. log4j2-spring.xml配置参数支持引用application.yml
3. 启用log4j2异步，提高日志性能



- 如何判断log4j2异步日志是否生效

1. 本项目运行后会输出日志

   ```
   是否为异步日志：true
   ```

   

2. 使用Java VisualVM等内存分析工具查看

![image-20240719090349777](assets/README/image-20240719090349777.png) 



