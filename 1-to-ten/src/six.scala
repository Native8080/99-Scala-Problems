//P06 (*) Find out whether a list is a palindrome.
//  Example:
//  scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true

object six {
  def isPalindrome[A] (list: List[A]): Boolean = list.reverse == list

  def main(args: Array[String]): Unit = {

    val fooList = List(1,2,3,4,5)
    val barList = List(1,2,3,2,1)

    println(isPalindrome(fooList))
    println(isPalindrome(barList))
  }
}