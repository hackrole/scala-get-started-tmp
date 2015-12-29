abstract class Writer {
  def writeMessage(message:String)
}

trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String) =
    super.writeMessage(message.toUpperCase)
}

trait ProfanityFilterdWriter extends Writer {
  abstract override def writeMessage(message:String) =
    super.writeMessage(message.replace("stupid", "s------"))
}

class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter

  def writeMessage(message:String) = writer.write(message)
  override def toString():String = writer.toString
}

val myProf = new StringWriterDelegate with UpperCaseWriter with ProfanityFilterdWriter

val myUp = new StringWriterDelegate with ProfanityFilterdWriter with UpperCaseWriter

myProf writeMessage("There is no sin except stupidity")
myUp writeMessage("There is no sin extends stupidity")

println(myProf)
println(myUp)
