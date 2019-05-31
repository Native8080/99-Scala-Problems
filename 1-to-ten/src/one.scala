//package native.codework.scala

object one {

  def scalaLibLast[A](aList:List[A]): Option[A] = aList.lastOption

  def lastListElement[A](aList: List[A]):Option[A]  = aList match {
    case last :: Nil => Some(last)
    case _ :: tail => lastListElement(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val intList = List.range(1,21)
    println("Find last element in a list")
    println(intList)
    println(scalaLibLast(intList))
    println(lastListElement(intList))
  }

}

