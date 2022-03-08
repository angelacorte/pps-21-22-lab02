package u02lab

object Es5 extends App:

  def compose(f:Int => Int, g:Int => Int): Int => Int=
    (x:Int) => f(g(x))

  def composeGeneric[X](f: X => X, g:X => X): X => X =
    (x:X) => f(g(x))

  println(compose(_ - 1, _ * 2)(5)) //9
  println(composeGeneric[Int](_ - 1, _ * 2)(5))
  println(composeGeneric[String](_ + "!", _ + "World")("Hello "))
