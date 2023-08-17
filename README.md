## 说明
mybatis-complete，顾名思义，只是对mybatis的补充，没有更改mybatis的任何功能。  
和mybatis-plus比较像，但是引入即可用，不像mybatis-plus还要改原有的配置文件。

## 功能
- [x] 单表
  - [x] 实体类增删改查接口
  - [x] 查询dsl
    - [x] select，groupBy，having，orderBy语法
    - [x] eq(=)，gt(>)，ge(>=)，lt(<)，le(<=)，ne(!=)，like，or，in，not in，is null，is not null语法
  - [x] 删除dsl
  - [x] 修改dsl
- [ ] 双表查询(可自动返回嵌套结果，告别resultMap标签)
  - [ ] innerJoin，leftJoin，rightJoin语法
  - [ ] select，groupBy，having，orderBy语法
  - [ ] eq(=)，gt(>)，ge(>=)，lt(<)，le(<=)，ne(!=)，like，or，in，not in，is null，is not null语法
- [x] 分页
- [x] EXISTS和NOT EXISTS的sql脚本
- [x] 逻辑删除
- [x] 填充指定的数据库字段
- [ ] 多租户(1.1版本开发)
- [x] 打印完整的sql语句和执行时间
- [x] 并发版本控制
- [ ] 多数据源
  - [ ] 基于注解使用的多数据源
  - [ ] 基于dsl的动态多数据源
- [ ] 多种主键生成策略
- [ ] 多数据库适配
- [ ] 代码生成器
  - [x] 逆向工程

## 特性预览
#### 单表操作：  
```java
EntityQuery<SysUser> entityQuery = new EntityQuery<>();
entityQuery.eq(SysUser::getAccount, "小明").eq(SysUser::getUserPwd, "ggg").asc(SysUser::getId);
List<SysUser> sysUserList = sysUserService.dslQuery(entityQuery);
```

## 使用文档
使用文档可直接看mybatis-complete-boot-starter-test下的[配置文件](https://github.com/tailwolf/mybatis-complete/blob/0.x/mybatis-complete-boot-starter-test/src/main/resources/application.yml)和[测试用例](https://github.com/tailwolf/mybatis-complete/tree/0.x/mybatis-complete-boot-starter-test/src/test/java/com/tailwolf/test/doc)
