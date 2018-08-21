package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  println("Recursion class test")

  def factorial(n : Int): Int = {
    if ( n <= 1 ) {
      println(s"computed fact($n)")
      n
    } else {
      println(s"fact($n) - need fact("+ (n-1) +")")
      val result = n * factorial(n-1)
      println(s"computed fact($n)")
      result
    }
  }
  println(factorial(6))
  //println(factorial(50000)) // stackOverflowError

  def factorialTailRec(n: Int): BigInt = {

    def factHelper(n: Int, accumulator: BigInt): BigInt = {
      if (n <= 1) accumulator
      else factHelper(n-1,n*accumulator)
    }

    factHelper(n,1)
  }
  //println(factorialTailRec(50000))


  def fibonacci(n: Int): Int = {
    if ( n == 0 ) 0
    if ( n == 1 || n == 2 ) 1
    else fibonacci(n-1)+fibonacci(n-2)
  }
  println(fibonacci(4))


  def fibonacciTailRec(n: Int): Int = {
    @tailrec
    def fibonacciHelper(nInner: Int, firstAccumulator: Int, secondAccumulator: Int): Int = {
      if ( nInner >= n ) firstAccumulator
      else fibonacciHelper(nInner+1, firstAccumulator + secondAccumulator, firstAccumulator )
    }

    if ( n == 0 ) 0
    if ( n == 1 || n == 2 ) 1
    else fibonacciHelper(2,1,1)
  }
  println(fibonacciTailRec(4))


  def isPrime(n: Int) : Boolean = {
    def isPrimeHelper(nInner: Int): Boolean = {
      if ( nInner <= 1 ) true
      else n % nInner != 0 && isPrimeHelper(nInner-1)
    }

    isPrimeHelper(n/2)
  }

  println(isPrime(7))
  println(isPrime(12))

  def sommaPrec(n: Int): Int = {
    if (n == 0 || n == 1) 0
    else n + sommaPrec(n-1)
  }
  println(sommaPrec(1))
  println(sommaPrec(3))

  def sommaPrecTailRec(n: Int): Int = {
    def sommaPrecHelper(nInner: Int, accumulator: Int): Int = {
      if ( nInner <= 1 ) accumulator
      else sommaPrecHelper(nInner-1, nInner+accumulator )
    }

    sommaPrecHelper(n,0)
  }
  println(sommaPrecTailRec(1))
  println(sommaPrecTailRec(3))
}
