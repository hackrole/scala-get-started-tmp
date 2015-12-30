import scala.actors._
import Actor._

val expect = actor {
  for(i <- 1 to 4){
    receiveWithin(1000){
      case str: String => println("You said " + str)
      case num: Int => println("You gave " + num)
      case TIMEOUT => println("Timed out!")
    }
  }
}

expect ! "only constant is change"
expect ! 1024
expect ! 22.22
expect ! (self, 1024)

receiveWithin(3000) { case _ => }
