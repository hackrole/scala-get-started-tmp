class Sample {
  def unary_+ = println("Called unary +")
  def unary_- = println("Called unaray -")
  def unary_! = println("Called unaray !")
  def unary_~ = println("Called unaray ~")
}

val sample = new Sample
+sample
-sample
!sample
~sample
