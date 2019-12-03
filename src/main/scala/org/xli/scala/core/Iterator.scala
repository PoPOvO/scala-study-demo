package org.xli.scala.core

trait Iterator[A] {
  // 定义一个String类型的字段
  var name: String
  // 获取迭代器中下一个元素
  def next: A
  // 迭代器是否还有下一个元素
  def hashNext: Boolean
}
