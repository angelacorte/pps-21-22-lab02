package u02lab

object Es8 extends App:

  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
      case Some(a) if f(a) => Some(a)
      case _ => None()

    def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt match
      case Some(a) => Some(f(a))
      case _ => None()

    def map2[A, B](opt1: Option[A], opt2: Option[A])(f: (A,A) => B): Option[B] = (opt1, opt2) match
      case (Some(a), Some(b)) => Some(f(a,b))
      case _ => None()

  import Option.*

  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()
  val s4: Option[Int] = Some(5)


  println(s1) //Some(1)
  println(orElse(s1, 0))
  println(orElse(s3, 0)) // 1,0
  println(flatMap(s1)(i => Some(i + 1))) // Some(2)
  println(flatMap(s1)(i => flatMap(s3)(j => Some(i + j)))) // None
  println(flatMap(s1)(i => flatMap(s2)(j => Some(i + j)))) // Some(3)
  println(filter(s4)(_ > 2)) //Some(5)
  println(filter(s4)(_ > 8)) //None
  println(filter(s3)(_ > 2)) //None

  println(map(s4)(_ > 2))  // Some(true)
  println(map(s4)(_ > 8)) // Some(false)
  println(map(s3)(_ > 2)) // None

  println(map2(s1,s2)(_ + _))
