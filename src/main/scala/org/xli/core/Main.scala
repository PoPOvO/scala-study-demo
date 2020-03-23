package org.xli.core

import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    println("===========Hello Scala===========")

    /**
      * 测试Point0
      */
    val point = new Point0(5, 4)
    point.move(1, 2)
    println(point.toString)

    /**
      * 测试元组
      */
    val tuple = (1, "Hello"): Tuple2[Int, String] // 可以直接写为 val tuple = (1, "Hello")，这里是为了清晰表达元组
    println("元组", tuple._1, tuple._2) // (元组,1,Hello)

    val (code, msg) = tuple
    println("解构", code, msg) // (解构,1,Hello)

    // 元组作为方法返回值
    def tupleTest(code: Int = 0, msg: String = "") = {
      (code, msg)
    }
    println(tupleTest(5, "World"))

    // 元组用于for循环
    val numPairs = List((2, 5), (3, -7), (20, 56))

    for ((a, b) <- numPairs) {
      println(a * b)
    }

    /**
      * 高阶函数
      */
    // 函数作为参数，作为map的callbakc
    var list = List(1, 2, 3)
    list = list.map(_ * 2)
    println(list)

    // 函数作为参数
    def fun1(f: Int => Int): Int = {
      f(5) + 1
    }
    val res = fun1(x => x * 2)
    println("结果", res) // (结果,11)

    // 函数作为返回值
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
      val schema = if (ssl) "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println("函数作为返回值", url)

    /**
      * 样例类
      */
    val msg1 = Message("错误", 1000)
    val msg2 = msg1.copy("错误拷贝", 1000)
    println("样例类", msg1 == msg2)
    val codes = msg1.code

    /**
      * 模式匹配
      */
    val x: Int = Random.nextInt(4)
    // 返回一个匹配的结果
    def matchMethod(x: Int): String = {
      x match {
        case 0 => "zero"
        case 1 => "one"
        case 2 => "two"
        case _ => "other"
      }
    }
    val matchRes = matchMethod(x) // 匹配的结果，例如: other
    println(matchRes) // 匹配的结果，例如: other

    /**
      * for 表达式
      */
    case class User(name: String, age: Int)

    val userBase = List(
      User("Travis", 28),
      User("Kelly", 33),
      User("Jennifer", 44),
      User("Dennis", 23)
    )

    val userList1 = for (
      user <- userBase
      if (user.age >=20 && user.age < 30)
    ) yield user.name
    println("for表达式1", userList1)

    val userList2 = userBase
      .filter(u => u.age >= 20 && u.age < 30)
      .map(u => u.name)
    println("for表达式1", userList2)

    // 三重循环
    val list3 = for (
      i <- 0 until 2;
      j <- 0 until 2;
      k <- 0 until 2
    ) yield s"($i, $j, $k)"
    println("for表达式1", list3)

    // 三重循环
    for (
      i <- 0 until 2
    ) println("迭代", i)

    var arr = List('A')
    arr = 'B' :: arr // 将B头插并生成新列表
    println("列表", arr)

    /**
      * 运算符
      */
    println("运算符1", 10.+(1), 10.*(2))
    println("运算符2", 10 + 1, 10 * 2)

    // 运算符重载
    val point1 = new Point1
    point1.x = 1
    point1.y = 2
    val point2 = new Point1
    point2.x = 3
    point2.y = 3

    val point3 = point1 + point2
    println("运算符重载 + ", point3)

    point1 move point2
    println("运算符重载 move ", point1)
  }
}
