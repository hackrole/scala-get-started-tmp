def process(input: Any){
  input match {
    case (a: Int, b: Int) => print("Processing (int, int)...")
    case (a: Double, b: Double) => print("Processing (double, double)...")
    case msg: Int if(msg > 10000) => println("Processing int > 10000")
    case msg: Int => println("Processing string...")
    case msg: String => println("Processing string...")
    case _ => printf("Can't handle %s...", input)
  }
}

process((34.2, -159.3))
process(0)
process(1000000)
process(2.2)
