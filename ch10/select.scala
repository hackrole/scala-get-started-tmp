import scala.actors._
import Actor._

trait SingleThreadedActor extends Actor {
  // XXX not working
  override protected def scheduler() = new SingleThreadedScheduler
}

class MyActor1 extends Actor {
  def act() = println("Actor1 running in " + Thread.currentThread)
}

class MyActor2 extends SingleThreadedActor {
  def act() = println("Actor2 running in " + Thread.currentThread)
}

println("Main running in " + Thread.currentThread)
new MyActor1().start()
new MyActor2().start()

actor {println("Actor 3 running in " + Thread.currentThread)}

receiveWithin(5000) {case _ => }
