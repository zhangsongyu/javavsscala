package scala.loop

import org.junit.Test

/**
  * for循环操作，如何在循环操作中获取集合
  */
object ForLoop {
  @Test
  def loog(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    for (i <- numbers) {
      println(i)
    }
    for (i <- 6 to 10) {
      println(i)
    }
    for (a <- 11 until 15) {
      println("Value of a: " + a)
    }
    for (x <- 1 to 3; y <- 1 to 3) {
      println(s"Value of x:${x}  y:${y}")
    }
    for (i <- 1 to 10; if i % 2 == 0; if i < 10) {
      println(s"loop with condition ${i}")
    }

    var evens: Seq[Int] = for {
      i <- 1 to 10; if i % 2 == 0
    } yield i
    println(s"events:${evens}")

  }
}
