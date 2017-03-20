 Android 数据库框架GreenDao的简单使用
1. GreenDao 介绍：
    greenDAO是一个对象关系映射框架(ORM)，能够提供一个接口通过对象操作的方式去操作关系型数据库，能够让你操作数据库时更简单、更方便。
2. GreenDAO 3.0 改动：
    3.0之前需要通过新建GreenDaoGenerator工程生成java对象（实体）和DAO对象，非常的繁琐而且也加大了使用成本。
    GreenDAO3.0最大的变化就是采用注解的方式通过编译方式生成java数据对象和DAO对象。
3. GreenDAO 3.0使用方式
    1> 在build.gradle添加如下配置
    // 根build.gradle下添加补充
    buildscript {
        repositories {
        mavenCentral()
    }
    
        dependencies {
        classpath 'org.greenrobot:greendao-gradle-plugin:3.0.0'
    }
 }
    // module 下的build.gradle中添加补充
    apply plugin: 'org.greenrobot.greendao'
    dependencies {
        compile 'org.greenrobot:greendao:3.0.1'
    }
    2）新建实体
    @Entity 
    public class User {
    @Id 
    private Long id; 
    private String name;
    private int age;//下面省去了 setter/getter
}