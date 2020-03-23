package org.xli.example

/**
  * 特质trait测试
  */
trait GreeterTrait {
  // 自类型
  this: Hello =>
  // 定义Greeter的特质
  def greet(): Unit

  def hello(): Unit = {
    print(msg)
  }
}
