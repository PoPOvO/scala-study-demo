package org.xli.core

/**
  * 带setter/getter的Point
  */
class Point1 {
  private var _x = 0
  private var _y = 0

  // 运算符重载，Point相加
  def +(p: Point1): Point1 = {
    val res = new Point1
    res.x = p.x + this.x
    res.y = p.y + this.y
    res
  }

  // 单参数的`move`使用中缀符访问
  def move(p: Point1): Unit = {
    this.x += p.x
    this.y += p.y
  }

  /**
    * _x的getter方法
    * @return
    */
  def x: Int = _x

  /**
    * _y的getter方法
    * @return
    */
  def y: Int = _y

  /**
    * _x的setter方法
    * @param newValue
    */
  def x_= (newValue: Int): Unit = {
    if (newValue > 0) {
      _x = newValue
    }
  }

  /**
    * _y的setter方法
    * @param newValue
    */
  def y_= (newValue: Int): Unit = {
    if (newValue > 0) {
      _y = newValue
    }
  }

  override def toString: String = s"($x, $y)"
}
