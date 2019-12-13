### spring-boot-mybatis-template 

```yaml

使用：spring h2    mybatis
使用：spring mysql mybatis

spring boot 2  默认使用 logback
项目集成：swagger

```

> 使用的是：autoMybatisGenerate.gradle   --->  generate/autoGeneratorConfig.xml
>
> mybatisGenerate.gradle 是一种备用方案  --->  generate/generatorConfig.xml
>


```text
@Bean
public MapperScannerConfigurer mapperScannerConfigurer(){
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setBasePackage("com.xxxx.dao");
    Properties propertiesMapper = new Properties();
    //通用mapper位置，不要和其他mapper、dao放在同一个目录
    propertiesMapper.setProperty("mappers", "com.xxxx.Mapper");
    propertiesMapper.setProperty("notEmpty", "false");
    //主键UUID回写方法执行顺序,默认AFTER,可选值为(BEFORE|AFTER)
    propertiesMapper.setProperty("ORDER","BEFORE");
    mapperScannerConfigurer.setProperties(propertiesMapper);
return mapperScannerConfigurer;

```