# gradle-multi-module
### Gradle多项目构建

#### 目录结构
common作为最基础的module，被其他module依赖。本Demo中依赖关系：common<user<log-merge<work-order
```
gradle-multi-module
│  .gitignore Git Ignore列表
│  build.gradle 根目录的gradle配置,可以设置一些所有module的共有配置。插件，参数，依赖等等
│  README.md
│  settings.gradle 维持module父子关系
├─.idea
├─common
│  │  build.gradle 
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─gradle
│      │  │          └─common
│      │  │              │  CommonApplication.java 默认扫描同级别下的所有包，common是最基础的module，就不需要配置@ComponentScan
│      │  │              │
│      │  │              └─entity
│      │  │                      CommonUtil.java 注入application-common.yml中的String参数并打印(其他module同理)
│      │  └─resources
│      │      │  application-common.yml 配置一个String参数(其他module同理)，测试Spring容器的启动和Bean加载情况。
│      │      │  application.yml 单独运行common module时会激活这个配置文件，其他module同理。不指定激活哪个配置文件时Springboot默认寻找application.yml或application-bootstrap.yml
├─user
│  │  build.gradle compile project(":common") 配置依赖关系(其他module同理)，依赖关系见下图
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─gradle
│      │  │          └─user
│      │  │              │  UserApplication.java 配置包扫描@ComponentScan({"com.gradle"})
│      │  │              │
│      │  │              └─entity
│      │  │                      User.java
│      │  └─resources
│      │      │  application-user.yml
│      │      │  application.yml spring.profiles.active: common,user 加载所依赖的module的所有配置
├─log-merge
│  │  build.gradle
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─gradle
│      │  │          └─logmerge
│      │  │              │  LogMergeApplication.java
│      │  │              │
│      │  │              └─entity
│      │  │                      LogMerge.java
│      │  └─resources
│      │      │  application-log-merge.yml
│      │      │  application.yml spring.profiles.active: common,user,log-merge 加载所依赖的module的所有配置
└─work-order
    │  build.gradle
    └─src
        ├─main
        │  ├─java
        │  │  └─com
        │  │      └─gradle
        │  │          └─workorder
        │  │              │  WorkOrderApplication.java
        │  │              │
        │  │              └─entity
        │  │                      WorkOrder.java 测试所有module的Bean加载情况
        │  └─resources
        │      │  application-work-order.yml
        │      │  application.yml spring.profiles.active: common,user,log-merge,work-order 加载所依赖的module的所有配置

```