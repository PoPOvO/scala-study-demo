package org.xli.example

object Main extends App {
  val ages = Seq(42, 778, 29, 64)

  println(s"The oldest person is ${ages.max}")

  /**
    * 常量
    */
  val a = "Alice"
  val b = 1
  val c = 2
  val d: Int = 1 + 1
  println("常量：" + a)

  /**
    * 变量
    */
  var e = 1 + 1
  println("变量：" + e)

  /**
    * 函数
    */
  val fun1 = (x: Int) => {
    val y = x + 1
    y * y
  }
  println("函数：" + fun1(5))

  /**
    * 方法
    */
  def method1(x: Int, y: Int): Int = x + y
  def method2(x: Int): Int = {
    val y = x - 1;
    y * y
  }
  def method3: String = "Test"
  println("方法：" + method1(1, 2))

  /**
    * 类
    */
  var greeter = new Greeter("Hello World!");
  greeter.greet();

  /**
    * 样例类
    */
  val point1 = Point(1, 1)
  val point2 = Point(1, 1)
  println("样例类：" + (point1 == point2)) // true

  /**
    * 对象
    */
  val newId = IdFactory.create()
  println("对象:" + newId)

  /**
    * 类型
    */
  val list: List[Any] = List(
    "Hello",
    888,
    'c',
    true,
    () => {
      println("some")
    }
  )
  list.foreach(e => {println(e)})

  /**
    * 类型转换
    */
  val x: Float = 5 // 5.0
  val y: Int = 'R' // 82
  println("类型转换" , x , y)
}
