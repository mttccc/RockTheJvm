package lectures.part2oop

object OOBasics extends App {


  val p = new Person("Matteo", 30)
  // println(p.name) error, parameters are NOT field!
  println(p.age) // this work thanks to val before age: Int
  println(p.x)
  p.greet("Marco")
  p.greet()

  val p2 = new Person("Marco")
  println(p2.age)

  println()

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy)
  println(novel.isWrittenBy(author))

  println()

  val counter = new Counter
  counter.inc().print()
  counter.inc(4).print()





  // constructor
  class Person(name: String, val age: Int) {

    val x = 3

    println(3*3*3)

    def greet(name: String) : Unit = println(s"${this.name}: Hello $name!")
    def greet() : Unit = println(s"Hi, I'm $name")

    // multiple constructor
    def this(name: String) = this(name,0)
    def this() = this("MATTEO")
  }

  class Writer(name: String, surname: String, val year: Int) {
    def fullname(): String = name + " " + surname
  }

  class Novel(name: String, yearOfRelease: Int, author: Writer) {
    def authorAge() = yearOfRelease-author.year
    def isWrittenBy() =  author.fullname
    def isWrittenBy(author: Writer) = author == this.author
    def copy(newyear: Int): Novel = new Novel(name,newyear,author)
  }

  class Counter(val counter: Int = 0) {

    def inc(): Counter = {
      println("increment")
      new Counter(counter+1)
    }
    def dec(): Counter = {
      println("decrement")
      new Counter(counter-1)
    }

    //def inc(newCounter: Int): Counter = new Counter(counter + newCounter)
    def dec(newCounter: Int): Counter = new Counter(counter - newCounter)

    def inc(newCounter: Int): Counter = {
      if (newCounter <= 0) this
      else inc.inc(newCounter-1)
    }

    def print(): Unit = println(counter)
  }

}
