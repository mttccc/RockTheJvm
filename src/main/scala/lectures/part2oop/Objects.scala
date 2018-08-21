package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (STATIC VARIABLE OR METHODS)

  // object does not have parameters!
  // objects are used to use class-level definition in Scala
  object Person {
    // for STATIC/CLASS LEVEL FUNCTIONALITY
    val N_EYES = 2
    val canFly = false

    // factory method - build Person instances
    //* def from(mother: Person, father: Person): Person = new Person("bobbie")
    def apply(mother: Person, father: Person): Person = new Person("bobbie")
  }
  class Person(val name: String) {
    // for INSTANCE LEVEL FUNCTIONALITY
  }

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object is a singleton instance

  val mary = new Person("mary")
  val john = new Person("john")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  //* val bobbie = Person.from(mary,john)
  val bobbie = Person(mary,john) // call the apply in the singleton Person object

  // Scala Applications
  

}
