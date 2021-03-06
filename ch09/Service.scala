object Symbol {
  def unapply(symbol: String) : Boolean = symbol == "GOOG" || symbol == "IBM"
}

object Price {
  def unapply(input: String) : Option[(String, Double)] = {
    try {
      if(input contains ":"){
        val splitQuote = input split ":"
        Some(splitQuote(0), splitQuote(1).toDouble)
      }else{
        None
      }
    }catch{
      case _ : NumberFormatException => None
    }
  }
}

object StockService {
  def process(input: String){
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
      case Price(symbol, price) =>
        printf("received %f for %s \n", price, symbol)
      case _ => println("Invalid input " + input)
    }
  }
}

StockService process "GOOG"
StockService process "GOOG:310.84"
StockService process "GOOG:BUY"
StockService process "ERR:12.21"
