abstract class Check {
  def check(): String = "Checked Application Details..."
}

// trait extends class. only use for check subclass
trait CreditCheck extends Check{
  override def check(): String = "Checked Credit..." + super.check()
}

trait EmploymentCheck extends Check{
  override def check(): String = "Checked Employment" + super.check()
}

trait CriminalRecordCheck extends Check{
  override def check(): String = "Check Criminal Records..." + super.check()
}

val apart = new Check with CreditCheck with CriminalRecordCheck
println(apart check)

val employ = new Check with CriminalRecordCheck with EmploymentCheck
println(employ check)
