//P05 (*) Reverse a list.
//Example:
//  scala> reverse(List(1, 1, 2, 3, 5, 8))
//res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object five {

  val fooList = List.range(1,10)

  def reverseList[A] (inputList: List[A]):List[A] = inputList.reverse

  def main(args: Array[String]):Unit = {
    println(fooList)
    println(reverseList(fooList))
  }

}