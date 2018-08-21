package lectures.part1basics

object CBNvsCBV {
  def callByValue(x: Long): Unit = {
    println("CallByValue: " +x)
    println("CallByValue: " +x)
  }

  def callByName(x: => Long): Unit = {
    println("CallByName: " +x)
    println("CallByName: " +x)
  }

  //callByValue(System.currentTimeMillis())
  callByValue(System.nanoTime())

  //callByName(System.currentTimeMillis())
  callByName(System.nanoTime())
}
