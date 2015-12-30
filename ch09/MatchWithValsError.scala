class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int){
    input match {
      case max => println("Donot try this at time") // compile error
      case MIN => println("You matched min")
      case _ => println("unreachable!!")
    }
  }
}
