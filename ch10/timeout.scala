import scala.actors._
import scala.actors.Actor._

val caller = self
val accumulator = actor {
  var sum = 0
  var continue = true
  while (continue){
    sum += receiveWithin(1000) {
      case number : Int => number
      case TIMEOUT =>
        println("Timed out! will return result now")
        continue = false
        0
    }
  }
  caller ! sum
}

accumulator ! 1 
accumulator ! 7
accumulator ! 8


receiveWithin(10000) {
  case result => println("total is " + result)
}
