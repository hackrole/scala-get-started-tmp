def process(input: String){
  val GooggStock = """^GOOG:(\d*\.\d+)""".r
  input match {
    case GooggStock(price) => println("Price of GOOG is " + price)
    case _ => println("not processing " + input)
  }
}

process("GOOG:310.84")
process("GOOG:310")
process("IBM:84.01")

def p2(input: String){
  val GooggStock = """^(.+):(\d*\.\d+)""".r
  input match {
    case GooggStock("GOOG", price) => println("Price of GOOG is " + price)
    case GooggStock("IBM", price) => println("IBM's trading at " + price)
    case GooggStock(symbol, price) => printf("Price of %s is %s\n", symbol, price)
    case _ => println("not processing " + input)
  }
}

p2("GOOG:310.84")
p2("IBM:84.01")
p2("GE:15.96")
