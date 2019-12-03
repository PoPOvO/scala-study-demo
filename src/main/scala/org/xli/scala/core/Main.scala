package org.xli.scala.core

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
    def tupleTest(code: Int = 0, msg: String = ""): Tuple2[Int, String] = {
      (code, msg)
    }
    println(tupleTest(5, "World"))

    // 元组用于for循环
    val numPairs = List((2, 5), (3, -7), (20, 56))

    for ((a, b) <- numPairs) {
      println(a * b)
    }
  }
}
