package Labsheet04
import scala.io.StdIn

object Q2 {

  def main(args: Array[String]): Unit= {
    println("Enter the number: ")
    val num= StdIn.readInt()

    println(patternMatching(num))
  }

  def patternMatching(x: Int): String= x match{
    case x if x <= 0 => "Negetive Number"
    case x if x == 0 => "Zero"
    case x if x%2 == 0 => "Even Number"
    case x if x%2 != 0 => "Odd Number"
  }
}
