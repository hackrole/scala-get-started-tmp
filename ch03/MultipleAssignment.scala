def getPersonInfo(primaryKey: Int) = {
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println("First Name is " + firstName)
println("Last Name is " + lastName)
println("Email address is " + emailAddress)

val info = getPersonInfo(1)

println("First Name is" + info._1)
println("First Name is" + info._2)
println("First Name is" + info._3)
