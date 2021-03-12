# 1.JDK1.8新特性

## 1.1Lambda表达式

- 定义：Lambda允许把函数作为一个方法的参数（函数作为参数传递到方法中）

- 条件：只有函数式接口才可以使用Lambda表达式

  - 函数式接口：只有一个抽象方法的接口，可以用**@FunctionalInterface**标注为函数式接口，在编译时期可以提前发现错误。

- 语法格式

  - ```java
    //1.不需要声明参数类型，编译器可以自动识别
    //2.如果是一个参数，圆括号可以省略不写，但是多个参数必须有圆括号
    //3.如果代码语句expression部分只包含一句，可以省略花括号，多个语句必须有花括号
    (params) -> {expression}
    ```

- 使用示例（注意：在实际开发中一般不允许直接创建线程，这里只作为eg）

  ```java
  //只有一句代码语句
  new Thread(() -> System.out.println("启动线程"), "线程名称").start();
  //多个代码语句
  new Thread(() -> {
    System.out.println("线程启动");
    System.out.println("线程结束");
  }, "线程名称").start();
  ```

  

## 1.2函数式编程

## 1.3Steam流

- 定义：stream流是集合元素的函数模型，可以理解为操作集合的工具类
- 方法

| 方法                        | 描述                                                         |
| :-------------------------- | :----------------------------------------------------------- |
| map(Function f)             | 接收函数作为参数，并映射成新的元素                           |
| filter(Predicate p)         | 接收布尔类型的函数为参数，排除掉一些元素                     |
| sorted()                    | 按照自然顺序排序                                             |
| sorted(Comparator c)        | 按照比较器的顺序排序                                         |
| allMatch(Predicate p)       | 检查是否匹配所有元素                                         |
| anyMatch(Predicate p)       | 检查是否至少匹配一个元素                                     |
| noneMatch(Predicate p)      | 检查是否没有匹配所有元素                                     |
| collect(Collector c)        | 将流转换为其他形式。接收一个 Collector接口的实现，将Stream中元素汇总 |
| partitioningBy(Predicate p) | 根据true和false进行分区                                      |

```java
//模拟创建一个User对象，包含字段name、age、sex，姓名、年龄、性别（男-true，女-false）
//User集合userList
//1.map(Function f)：结合collect(Collectors.toList())生成所有用户名称的新集合
List<String> nameList = userList.stream().map(user->user.get("name"))
  		.collect(Collectors.toList());
//2.filter(Predicate p)：筛选出性别为true的用户
List<User> manList = userList.stream().filter(User::isSex).collect(Collectors.toList());
//3.sorted()：按照自然顺序排序
//4.sorted(Comparator c)：默认情况是按照年龄升序排序，结合reversed()按照年龄降序排序
//						如果存在多个条件，可以结合thenComparing按照姓名自然序升序
List<User> newList = userList.stream().sorted(Comparator.comparing(User::getAge).reversed()
                .thenComparing(User::getName)).collect(Collectors.toList());
//5.partitioningBy(Predicate p)：根据性别分区
Map<Boolean, List<User>> collect = userList.stream()
  	.collect(Collectors.partitioningBy(User::isSex));
List<User> manList = collect.get(true);
List<User> womanList = collect.get(false);
```

