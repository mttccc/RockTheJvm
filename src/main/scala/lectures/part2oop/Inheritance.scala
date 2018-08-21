package lectures.part2oop

object Inheritance extends App {

  class Animal {

    val creatureType = "wild"

    def eat = println("animal gnam gnam")

    protected def eat2 = println("gnammy") // visible within class and in subclasses
    private def eat3 = println("GNAM") // visible only within class
  }

  class Cat extends Animal {
    def eatCat = eat2
  }

  val cat = new Cat
  cat.eat
  cat.eatCat

  // constructor
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name,age)

  // overriding
  class Dog extends Animal {
    override val creatureType: String = "domestic"
    override def eat: Unit = println("dog gnam gnam")
  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  // type substitution
  val unknownAnimal = new Dog
  unknownAnimal.eat

  // preventing overrides
  // 1 - final method
  // 2 - final class
  // 3 - seal class = class can be extended only in current file, not in other files

}
