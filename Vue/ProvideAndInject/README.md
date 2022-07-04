# Vue 3 provide与inject示例代码

本项目将测试vue的provide与inject功能，默认接口为```:8080/User/findUserAll```

在使用时需要先运行后端服务器：

### Python仅演示服务器

在```项目地址CodeExample/Vue/ProvideAndInject/PyBack```下运行：

```bash
python ./server.py
```

### Java全功能服务器

首先配置Mysql数据库，将在```项目地址CodeExample/Vue/ProvideAndInject/JavaBack```下的```vue.sql```文件导入到数据库中，修改```项目地址CodeExample/Vue/ProvideAndInject/JavaBack/src/main/resources/application.yml```相关数据库配置直至可以运行。

在```项目地址CodeExample/Vue/ProvideAndInject/JavaBack```下运行：

```bash
mvn package
```

然后在```项目地址CodeExample/Vue/ProvideAndInject/JavaBack/target```下运行

```bash
java -jar ./VueProvideAndInject-0.0.1-SNAPSHOT.jar
```

### 运行代码

然后在```项目地址CodeExample/Vue/ProvideAndInject/```下运行如下代码，即可运行网页。

```bash
npm run dev
```

