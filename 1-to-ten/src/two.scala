//package native.codework.scala


//P02 (*) Find the last but one element of a list.
//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5


object two {

  val fooList = List(1,2,3,4,5,6,7,8)
  val stringList = List("foo", "bar", "baz", "qux")

  val take_Right = (aList: List[Any]) => aList.takeRight(2).head


  val penultimate = (aList: List[Any]) => aList(aList.length - 2)


def secondToLast[A](list: List[A]):Option[A] = list match {
  case target :: _ :: Nil => Some(target)
  case _ :: tail => secondToLast(tail)
  case _ => throw new NoSuchElementException
}

  def main(args: Array[String]): Unit = {
    println(take_Right(fooList))
    println(take_Right(stringList))
    println(penultimate(fooList))
    println(penultimate(stringList))
    println(secondToLast(fooList))
    println(secondToLast(stringList))
  }

}
