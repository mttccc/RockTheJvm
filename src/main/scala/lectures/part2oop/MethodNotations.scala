package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def like(movie: String): Boolean = movie == favouriteMovie
    def isHangingOutWith(p: Person): String = s"${this.name} is hanging out with ${p.name}"
    def +(p: Person): String = s"${this.name} is hanging out with ${p.name}"

    def unary_! : String = s"${this.name}, what the heck!?"

    def isAlive : Boolean = true

    def apply(): String = s"Hi I'm $name, ($age) and I like $favouriteMovie"

    /*
      1.  overload + with string input and return new person with nickname
          e.g. mary + "the rock star" => person with name:  "mary (the rock star)"

      2.  add age to person class
          add unary + that return new person with age incremented by 1
          e.g. +mary => new mary with age incremented

      3.  add "learns" method to Person => "name learns scala"
          add learnScala method, call learns with "scala" (use it in postfix notation)

      4.  overload apply method to receive number and return string
          mary.apply(3) => mary watched 'favourite movie' 3 times
      */

    def +(nickname: String): Person = new Person(s"${this.name} ($nickname)", favouriteMovie)

    def unary_+ : Person = new Person(this.name,favouriteMovie,age+1)

    def learn(what: String): String = s"${this.name} learns $what"

    def learnScala = this.learn("Scala")

    def apply(times: Int): String = s"${this.name} watched $favouriteMovie $times times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.like("Inception"))
  println(mary.like("Star Wars"))

  val tom = new Person("Tom","Fight Club")

  // infix operator
  println(mary.isHangingOutWith(tom))
  println(tom isHangingOutWith mary) // infix notation or operator notation
  println(tom + mary)

  println(1+2)
  println(1.+(2))

  // prefix notation
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)

  // apply
  println(mary.apply)
  println(mary())

  // use new methods
  println("\nadd new methods:\n")
  println(mary + "the rock star" name)
  println((mary + "the rock star")())
  println((mary + "the rock star").apply())

  println((+mary).age)
  println((+mary)())

  println(mary.learn("Scala"))
  println(mary.learnScala)

  println(mary(4))


}
