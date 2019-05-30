import java.util.NoSuchElementException
//P03 (*) Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example:
//
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2


object three {
  def nth(index: Int, list: List[Any]): Any = list(index)

  def findNth[A](index: Int, inputList: List[A]): A = index match {
    case 0 => inputList.head
    case index if index > 0 => findNth(index - 1, inputList.tail)
    case _ => throw new NoSuchElementException
  }

  def findIndex[A](index: Int, list: List[A]): A = list match {
    case head :: _ if index == 0 => head
    case _ :: tail if index >= 0 => findIndex(index - 1, tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val fooList = List(5, 34, 748, 2, 45, 12)
    val barList = List("foo", "bar", "baz", List(849, 2, 14, 57, 42), 34, 'x', 'y', 'z')

    println(nth(3, fooList))
    println(findNth(4, fooList))
    println(findIndex(2, barList))

  }
}