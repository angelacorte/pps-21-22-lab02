package u02lab
import java.lang.Math

object Es7 extends App:

  enum Shape:
    case Rectangle(width:Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  object Shape:

    def perimeter(shape: Shape): Double = shape match
        case Shape.Rectangle(w, h) => w * 2 + h * 2
        case Shape.Circle(r) => 2 * Math.PI * r
        case Shape.Square(s) => s * 4


    def area(shape: Shape): Double = shape match
      case Shape.Rectangle(w, h) => w * h
      case Shape.Circle(r) => Math.PI * r * r
      case Shape.Square(s) => s * s

  println(Shape.perimeter(Shape.Rectangle(5,3))) //16.0
  println(Shape.perimeter(Shape.Circle(3))) //18.84955592153876
  println(Shape.perimeter(Shape.Square(4))) //16.0

  println(Shape.area(Shape.Rectangle(5,3))) //15.0
  println(Shape.area(Shape.Circle(3))) //28.274333882308138
  println(Shape.area(Shape.Square(4))) //16.0
