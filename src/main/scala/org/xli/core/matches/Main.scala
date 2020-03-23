package org.xli.core.matches

object Main {
  /**
    * 匹配动物
    * @param animal 动物类
    * @return
    */
  def animalMatch(animal: Animal, nameList: List[String]): String = {
    animal match {
      case Cat(name, age) if nameList.contains(name) =>
        s"这是猫：{$name, $age}"
      case Dog(name, age) if nameList.contains(name) =>
        s"这是狗：{$name, $age}"
      case Pig(name, age) if nameList.contains(name) =>
        s"这是猪：{$name, $age}"
      case _ => "Wrrrrrrrrrry"
    }
  }

  def animalMatchType(animal: Animal): String = {
    animal match {
      case cat: Cat =>
        "这是猫：" + cat.name
      case dog: Dog =>
        "这是狗：" + dog.name
      case pig: Pig =>
        "这是猪：" + pig.name
      case _ => "Wrrrrrrrrrry"
    }
  }

  def main(args: Array[String]): Unit = {
    val nameList = List("佩奇", "苏西", "乔治")

    println("匹配结果", animalMatch(Pig("佩奇", 12), nameList))
    println("匹配结果", animalMatch(Pig("鲍勃", 12), nameList)) // 这只pig不在nameList中，因此匹配不成功
    println("匹配结果", animalMatch(Dog("苏西", 11), nameList))

    println("匹配类型结果", animalMatchType(Pig("A", 11)))
  }
}
