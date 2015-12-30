import scala.actors.Actor._

var startTime : Long = 0
val caller = self

val eng = actor {
  println("Number of message received so far? " + mailboxSize)
  caller ! "send"
  Thread.sleep(3000)
  println("Number of messages received while I was busy? " + mailboxSize)
  receive {
    case msg =>
      val receivedTime = System.currentTimeMillis() - startTime
      println("Received message " + msg + " after " + receivedTime + " ms")
  }
  caller ! "received"
}

receive { case _ => }

println("Sending Message ")
startTime = System.currentTimeMillis()
eng ! "hello buddy"
val endTime = System.currentTimeMillis() - startTime

printf("took less than %dms to send message\n", endTime)

receive {
  case _ =>
}
