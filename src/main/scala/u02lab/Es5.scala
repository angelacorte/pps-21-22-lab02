package u02lab

object Es5 extends App:

  def compose(f:Int => Int, g:Int => Int): Int => Int=
    (x:Int) => f(g(x))

  def composeGeneric[X, Y, Z](f: Y => Z, g:X => Y): X => Z =
    (x:X) => f(g(x))

  println(compose(_ - 1, _ * 2)(5)) //9
  println(composeGeneric((n:Int) => n + " toString", (n:Int) => n * 2)(7))

