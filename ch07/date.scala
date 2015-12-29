import java.util._

class DateHelper(number:Int){
  def days(when: String):Date = {
    var date = Calendar.getInstance()
    when match {
      case "ago" => date.add(Calendar.DAY_OF_MONTH, -number)
      case "from_now" => date.add(Calendar.DAY_OF_MONTH, number)
      case _ => date
    }
    date.getTime()
  }
}

implicit def convertInt2DateHelper(number:Int) = new DateHelper(number)

val ago = "ago"
val from_now = "from_now"

val past = 2 days ago
val appointment = 5 days from_now

println(past)
println(appointment)
