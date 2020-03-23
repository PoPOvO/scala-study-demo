package org.xli.example

/**
  * 默认Greet实现
  */
class DefaultGreeter extends GreeterTrait with Hello {
  override def greet(): Unit = {
    println("Greet!")
  }

  override def hello(): Unit = {
    super.hello()
    println("World!")
  }
}
