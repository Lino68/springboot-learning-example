##### 关于`CommandLineRunner`和`ApplicationRunner`
>我们在开发中可能会有这样的情景。需要在容器启动的时候执行一些内容。比如读取配置文件，数据库连接之类的。SpringBoot给我们提供了两个接口来帮助我们实现这种需求。这两个接口分别为CommandLineRunner和ApplicationRunner。他们的执行时机为容器启动完成的时候。

##### 运行结果
```
=> This is CommandLineRunner2, order is 1
=> This is CommandLineRunner1, order is 2
=> This is ApplicationRunner2, order is 3
=> This is ApplicationRunner1, order is 4
```

**注意：** 如果不加`@Order`注解的时候，默认先执行完所有的`ApplicationRunner`，然后是所有的`CommondLineRunner`。
