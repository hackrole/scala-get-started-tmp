import scala.actors.Actor._

def range(lower: Int, upper: Int, number: Int) = {
  (0 /: (lower to upper)) { (sum, i) => if(number % i == 0) sum + i else sum}
}

def isgood(num: Int) = {
  val RANGE = 1000000
  val number = (num.toDouble / RANGE).ceil.toInt
  val caller = self

  for (i <- 0 until number) {
    val lower = i * RANGE + 1;
    val upper = num min(i + 1) * RANGE

    actor {
      caller ! range(lower, upper, num)
    }
  }

  val sum = (0 /: (0 until number)) {(part, i) =>
    receive {
      case sumInRange: Int => part + sumInRange
  }}

  2 * num == sum
}

println("6 is good" + isgood(6))
println("33550336 is good " + isgood(33550336))
println("33550337 is good " + isgood(33550337))
