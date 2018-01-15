# boy-mvc-framework
> BruceOuyang在学习搭建一个自己的mvc框架。  
> 参考黄勇老师的《架构探险-从零开始写Java Web框架》

# 第一章 从一个简单的Web应用开始

## 1 使用IDEA创建Maven项目
**必备技能一**  
 - 使用IDEA搭建并开发java项目；
 - 使用Maven自动化构建java项目；
 - 使用Git管理项目源码

## 2 需求分析与系统设计 
**必备技能二**
 - 如何进行需求分析
 - 如何进行系统设计
 - 如何编写应用程序
 
> 先从原始需求中找出Use Case(用例)，然后设计表结构，画原型图，定义URL规范，就这一逐步完成设计工作。  
> 设计过程是由粗到细、由表及里的，设计阶段不涉及具体的技术实现，因为那是开发阶段要做的事情。

- 1 设计用例（以下为用例示例）
    - 查询客户
    - 显示客户列表
    - 显示客户基本信息
    - 创建客户
    - 编辑客户
    - 删除客户
- 2 设计表结构（以下为示例）

| 字段名 | 数据类型 | 是否非空 | 字段描述|
|--------|----------|----------|---------|
|   id   |  BIGINT  |    Y     |ID（自增主键）|
name | VARCHAR(255) | Y | 客户名称

- 3 设计界面原型（示例略）

- 4 设计URL

序号 | URL | 描述
---  | --- | ---
1 | GET:/customer|进入客户列表页
2 | POST:/customer/search|查询客户
3 | GET:/customer/show/{id}|进入客户详情页
4 | GET:/customer/create|进入创建客户页面
5 | POST:/customer/create|处理创建客户请求
6 | GET:/customer/edit|进入编辑客户页面
7 | PUT:/customer/edit|处理编辑客户请求
8 | DELTE:/customer/delete/{id}|删除客户



