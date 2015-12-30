def activity(day:String){
  day match {
    case "Sunday" => print("Eat, sleep, repeat...")
    case "Saturday" => print("Hangout with friends...")
    case "Monday" => print("...code for fun...")
    case "Friend" => print("..read a good book...")
  }
}

List("Monday", "Sunday", "Saturday").foreach { activity }
