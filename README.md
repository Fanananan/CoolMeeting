# Cool Meeting

一个基于 SSM 框架的会议管理系统，使用技术栈为：SSM + FreeMarker + jQuery + Ajax + MySQL

项目开发依赖统一使用 Maven 管理：
1. spring-webmvc：SpringMVC 的依赖，其中包含 Spring
2. javax.servlet-api：为了兼容性没有使用 jakarta 包
3. spring-jdbc
4. mysql-connector-java
5. druid：可能存在无法兼容 JDK11 的情况，[解决方法](https://aidanblog.top/2021/08/25/Solution-Maven-druidApply11/)
6. mybatis：
7. mybatis-spring