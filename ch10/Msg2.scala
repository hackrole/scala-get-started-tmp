import scala.actors._
import Actor._

val fort = actor {
  for(i <- 1 to 4){
    Thread.sleep(1000)
    receive {
      case _ => sender ! "your day will rock! " + i
    }
  }
}

println(fort !? (2000, "whats ahead!"))
println(fort !? (500, "what's ahead"))


val ap = actor {
  receive { case msg => println("ah. fort messag for you-" + msg) }
}

fort.send("whats up", ap)
fort ! "hows my future?"

Thread.sleep(3000)
receive {case msg: String => println("Received " + msg)}

println("lets get that lost message")
receive { case !(channel, msg) => println("Received belated message " + msg) }
