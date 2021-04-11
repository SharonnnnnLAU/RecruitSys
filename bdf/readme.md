####说明：
BDF即Base Develop Frame（基础开发框架），主要由两个包组成：util和base，util包提供了常用的工具类，base包整合了SSH基础框架。

####练习：
1. Gradle依赖管理基础练习
2. 引入bdf两个基础包，搭建基于ssh整合框架的web站点
3. 学习CAS单点登录，并集成到该web站点中，将登录用户信息存储到SessionContent类中
4. 学习配置spring-dao.xml并使用HibernateBaseDao访问数据库
5. 基于SSH框架实现一个简单的建设项目信息登记系统（实现项目信息的增删改查）
    1. 了解com.dist.bdf.util.convert包下面的springmvc格式转换
    2. 使用BaseController\LoggedinController
    3. 使用Swagger注解生成Api说明文档
    4. 使用util下面常用工具包string、format、security、spring、file等
    5. 使用Result类作为统一输出格式