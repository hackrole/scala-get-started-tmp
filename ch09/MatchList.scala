def processItems(items:List[String]){
  items match {
    case List("apple", "ibm") => println("APples and IBMs")
    case List("red", "blue", "white") => println("Stars and Stripes...")
    case List("red", "blue", _*) => println("Colors red, blue, ...")
    case List("apple", "orange", otherFruits @ _*) =>
      println("apples, orange, and " + otherFruits)
  }
}

processItems(List("apple", "ibm"))
processItems(List("red", "blue", "green"))
processItems(List("red", "blue", "white"))
processItems(List("apple", "orange", "grapes", "dates"))
