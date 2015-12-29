import java.util._
// TODO java Static Import

var list1 : List[Int] = new ArrayList[Int]
var list2 = new ArrayLit[Int]

list2 add 1
list2 add 2

var total = 0
// TODO raise Error?
for (val index <- 0 until list2.size()) {
  total += list2.get(index)
}

println("Total is " + total)
