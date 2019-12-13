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
/**
* 使用通用Mapper之前需要初始化的一些信息
* 使用通用Mapper插件时请勿使用热加载,否则报错,插件作者后续应该会修复
*/
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

/**
* 配置mybatis的分页插件pageHelper
*/
@Bean
public PageHelper pageHelper(){
   PageHelper pageHelper = new PageHelper();
   Properties properties = new Properties();
   //设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用
   properties.setProperty("offsetAsPageNum","true");
   //置为true时，使用RowBounds分页会进行count查询
   properties.setProperty("rowBoundsWithCount","true");
   //合理化查询,启用合理化时，
   //如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页
   //未开启时如果pageNum<1或pageNum>pages会返回空数据
   properties.setProperty("reasonable","true");
   //配置mysql数据库的方言
   properties.setProperty("dialect","mysql");   
   pageHelper.setProperties(properties);
   return pageHelper;
}
```