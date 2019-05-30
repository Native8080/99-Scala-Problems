//P04 (*) Find the number of elements of a list.
//  Example:
//  scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6

object four {

  def lengthOfList[A] (list: List[A]):Int = list.length


  def main(args: Array[String]): Unit = {

      val fooList = List(1,2,3,4,5)

    println(lengthOfList(fooList))
  }
}
