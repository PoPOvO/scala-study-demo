package org.xli.core

import scala.util.matching.Regex

object RegexMain {
  def main(args: Array[String]): Unit = {
    /**
      * 正则匹配
      */
    val pattern1: Regex = "[0-9]".r

    pattern1.findFirstMatchIn("awesomepass8ord") match {
      case Some(value) => println(s"密码OK：$value")
      case None => println("密码必须包含数字")
    }
  }
}
