package u02lab

object Es4 extends App:

  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y <= z
  println(p1(1)(2)(3)) //true
  println(p1(3)(2)(4)) //false

  val p2:(Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) => x <= y && y <= z
  println(p2(1,2,3)) //true
  println(p2(3,2,4)) //false

  def p3(x:Int)(y:Int)(z:Int): Boolean = x <= y && y <= z
  println(p3(1)(2)(3)) //true
  println(p3(3)(2)(4)) //false

  def p4(x:Int, y:Int, z:Int): Boolean = x <= y && y <= z
  println(p4(1,2,3)) //true
  println(p4(3,2,4)) //false
