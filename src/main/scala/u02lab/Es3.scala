package u02lab

object Es3 extends App:

  println("Task 3a")
  val f1: Int => String =
    (x:Int) => x%2 match
      case 0 => "Even"
      case 1 => "Odd"

  def intToString(x: Int): String = x%2 match
    case 0 => "Even"
    case _ => "Odd"

  println(f1(5)) //Odd
  println(f1(4)) //Even
  println(intToString(5)) //Odd
  println(intToString(4)) //Even

  println("Task 3b")
  def neg(fun: String => Boolean) : (String => Boolean) = s => !fun(s)

  val empty: String => Boolean = _ == ""
  val notEmpty: String => Boolean = neg(empty)

  println(notEmpty("foo")) //true
  println(notEmpty("")) //false
  println(notEmpty("foo") && !notEmpty("")) //true

  println("Task 3c")
  def negGenerics[X](fun: X => Boolean) : (X => Boolean) = s => !fun(s)

  val intToBool: Int => Boolean = _ == 1
  val negInt: Int => Boolean = negGenerics[Int](intToBool)

  println(negInt(1)) //false
  println(negInt(0)) //true
  println(negInt(1) && !negInt(2)) //false

