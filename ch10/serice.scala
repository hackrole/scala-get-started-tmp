import scala.actors._
import Actor._

class Answer(val folks: String*) extends Actor{
  def act() {
    while (true) {
      receive {
        case (caller : Actor, name :String, msg: String) =>
          caller ! (
            if(folks.contains(name))
              String.format("Hey its %s got message %s", name, msg)
            else
              String.format("Hey theres no one with the name %s here", name)
            )
        case "ping" => println("ping!")
        case "quit" => println("exiting actor")
          exit
      }
    }
  }
}

val answer = new Answer("Sara", "Kara", "John")

answer ! (self, "Sara", "In town")
answer ! (self, "Kara", "Go shopping?")

answer.start()

answer ! (self, "John", "Bug fixed?")
answer ! (self, "Bill", "Whats up")

for(i <- 1 to 4) { receive {case msg => println(msg)} }

answer ! "ping"
answer ! "quit"
answer ! "ping"

Thread.sleep(2000)
println("The last ping was not processed")
