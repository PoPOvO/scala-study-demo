package org.xli.core

import java.time.LocalDateTime
import java.util

/**
  * 测试Scala和Java的交互
  */
object JavaDemo {
  def main(args: Array[String]): Unit = {
    // 使用Java LocalDateTime类
    val date = LocalDateTime.now()
    print("时间", date)

    // 使用Java的ArrayList
    val list = new util.ArrayList[String]()
    list.add("A")
  }
}
