import scala.actors._
import Actor._

val caller = self
val accum = actor {
  var continue = true
  var sum = 0

  loopWhile(continue) {
    reactWithin(500) {
      case number : Int => sum += number
      case TIMEOUT => continue = false; caller ! sum
    }
  }
}

accum ! 1
accum ! 7
accum ! 8

receiveWithin(1000) { case result => println("Total is " + result) }
