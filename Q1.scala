package Labsheet04
import scala.io.StdIn

object Q1 {

  def main(args: Array[String]): Unit= {
    println("Enter your income: ")
    val income= StdIn.readInt()

    println("Your annual interest: " + interest(income))

  }

  def interest(y: Int): Double= y match {
    case x if x <= 0 => 0
    case x if x <= 20000 => x*0.02
    case x if x <= 200000 => x*0.04
    case x if x <= 2000000 => x*0.035
    case x if x > 2000000 => x*0.065
  }

}
