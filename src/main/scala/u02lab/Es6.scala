package u02lab

object Es6 extends App:

  //@annotation.tailrec makes sure that this recursion is not a tail one
  def fibonacci(x:Int): Int = x < 2 match
    case true => x
    case false =>  fibonacci(x-1) + fibonacci(x-2)

  println(fibonacci(0)) //0
  println(fibonacci(10)) //55
