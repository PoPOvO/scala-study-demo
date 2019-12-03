package org.xli.scala.core

/**
  * 默认Iterator实现
  */
class DefaultIterator(max: Int) extends Iterator[Int] {
  // 覆盖Trait的name字段
  override var name: String = "Default"

  private var count = 0

  override def next: Int = {
    if (hashNext) {
      count += 1
      count
    } else 0
  }

  override def hashNext: Boolean = count < max
}
