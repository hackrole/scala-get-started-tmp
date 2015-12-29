for(i <- 1 to 3) {print("ho ")}

val result = for(i <- 1 to 10) yield 1 * 2
println(result)

val result2 = (1 to 10).map(_ * 2)
println(result2)

val double = for(i <- 1 to 10; if 1% 2 == 0) yield i * 2
println(double)

for {
  i <- 1 to 10
  if i %2 == 0
}
yield i + 2
