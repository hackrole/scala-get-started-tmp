def findMax(temperatures: List[Int]) = {
  temperatures.foldLeft(Integer.MIN_VALUE){ Math.max }
}

val l = List(1, 2, 3, 4)
println(findMax(l))
