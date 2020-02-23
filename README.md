# gradle-multi-module
### Gradle多项目构建

####目录结构
```
gradle-multi-module
│  .gitignore
│  build.gradle
│  README.md
│  settings.gradle
├─.idea
├─common
│  │  build.gradle
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─gradle
│      │  │          └─common
│      │  │              │  CommonApplication.java
│      │  │              │
│      │  │              └─entity
│      │  │                      CommonUtil.java
│      │  └─resources
│      │      │  application-common.yml
│      │      │  application.yml
├─user
│  │  build.gradle
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─gradle
│      │  │          └─user
│      │  │              │  UserApplication.java
│      │  │              │
│      │  │              └─entity
│      │  │                      User.java
│      │  └─resources
│      │      │  application-user.yml
│      │      │  application.yml
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
│      │      │  application.yml
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
        │  │                      WorkOrder.java
        │  └─resources
        │      │  application-work-order.yml
        │      │  application.yml

```