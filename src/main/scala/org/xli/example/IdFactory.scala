package org.xli.example

/**
  * 单例对象测试
  */
object IdFactory {
  private var counter = 0

  // 生成单例Id
  def create(): Int = {
    counter += 1
    counter
  }

  def main(args: Array[String]): Unit = {
    println("IdFactory")
  }
}
