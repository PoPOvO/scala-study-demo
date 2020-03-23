package org.xli.example

import scala.math._

/**
  * 伴生对象
  */
object Circle {
  // 计算圆面积
  private def calcuArea(r: Double): Double = Pi * pow(r, 2.0)
}

/**
  * 伴生类
  */
class Circle(r: Double) {
  // 导入单例对象
  import Circle._
  private val _area: Double = calcuArea(r)

  def area: Double = _area
}
