package org.xli.example

/**
  * 特质trait测试
  */
trait GreeterTrait {
  // 定义Greeter的特质
  def greet(): Unit

  def hello(): Unit = {
    print("Hello!")
  }
}
