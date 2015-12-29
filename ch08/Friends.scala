class Person(val fname:String, val lname:String)

object Person {
  def apply(fname:String, lname:String): Person =
    new Person(fname, lname)
}

val friends = List(Person("Brian", "Sletten"),
  Person("Neal", "Ford"), Person("Scott", "Davis"),
  Person("Sturart", "Halloway"))
val lNames = for (friend <- friends; lastName = friend.lname) yield lastName

println(lNames.mkString(", "))

for (i <- 1 to 3; j <- 4 to 6){
  print("[ " + i + ", " + j + "] ")
}
