def fac(number: Int) = {
  (0 /: (1 to number)) { (sum, i) => if (number % i == 0 ) sum + i else sum }
}

def isPerfect(candidate: Int) = 2 * candidate == fac(candidate)

println("6 is good " + isPerfect(6))
println("33550336 is good " + isPerfect(33550336))
println("33550337 is good " + isPerfect(33550337))
