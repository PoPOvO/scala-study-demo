package org.xli.example

/**
  * 测试类
  * @param message 消息
  */
class Greeter(message: String) {
  private val str = "Greeter:"

  def greet(): Unit = println(str + message)
}
