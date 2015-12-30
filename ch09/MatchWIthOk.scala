class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int){
    input match {
      case this.max => println("You matched max")
      case MIN => println("YOu matched min")
      case _ => println("unreachable!!!")
    }
  }
}

new Sample().process(100)
new Sample().process(0)
new Sample().process(10)
