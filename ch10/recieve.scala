import scala.actors.Actor._

val caller = self

val accum = actor {
  var sum = 0
  var continue = true
  while (continue) {
    sum += receive {
      case number : Int => number
      case "quit" =>
        continue = false
        0
    }
  }
  caller ! sum
}

accum ! 1
accum ! 7
accum ! 8
accum ! "quit"

receive { case result => println("Total is " + result) }
