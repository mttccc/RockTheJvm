package lectures.part1basics

object StringOps extends App {

  // S-interpolator
  val name = "Matteo"
  val age = 30
  val greeting = s"Hi, my name is $name and I'm $age years old"
  val greeting2 = s"Hi, my name is $name and I'm ${age+1} years old"
  println(greeting)
  println(greeting2)

  // F-interpolator
  val floatVal: Float = 3.5f
  val consumption = f"consumption: $floatVal l/100km"
  println(consumption)

  // raw-interpolator
  println(raw"string with \n raw interpolator")
}
