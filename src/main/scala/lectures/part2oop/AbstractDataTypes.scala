package lectures.part2oop

object AbstractDataTypes extends App {

  abstract class Animal{
    val creatureType : String
    def eat : Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "canine"
    override def eat: Unit = println("dog: gnam gnam")
  }

  // traits
  trait Carnivore {
    def eat(what: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(what: Animal): Unit = println(s"I'm croc and I'm eating ${what.creatureType}")
    override val creatureType: String = "croc"
    override def eat: Unit = println("croc: nom nom")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)


  // traits vs abstract classes
  // 1 - trait do not have constructor parameters
  // 2 - trait = describe behaviour , abstract classes = describe things
}
