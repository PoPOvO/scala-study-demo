package org.xli.scala.core

/**
  * 带setter/getter的Point
  */
class Point1 {
  private var _x = 0
  private var _y = 0

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
}
