package org.xli.scala.core

class Point0(var x: Int = 0, var y: Int = 0) {
  /**
    * Point移动
    * @param dx
    * @param dy
    */
  def move(dx: Int = 0, dy: Int = 0): Unit = {
    x += dx
    y += dy
  }

  /**
    * 覆盖toString
    * @return
    */
  override def toString: String =
    s"$x, $y"
}
