import scala.actors._
import Actor._

case class Apple()
case class Orange()
case class Book()

class ThingAcdeptor {
  def acceptStuff(thing: Any){
    thing match {
      case Apple() => println("thansk for the Apple")
      case Orange() => println("orange")
      case Book() => println("book")
      case _ => println("send me a" + thing)
    }
  }
}

val accept = new ThingAcdeptor
accept.acceptStuff(Apple())
accept.acceptStuff(Book())
accept.acceptStuff(Apple)
