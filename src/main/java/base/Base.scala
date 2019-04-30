package base

import org.junit._


class Base {

  @Test
  def variate(): Unit = {
    //在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
    var myVar: String = "Foo" //Stirng str="Foo"
    val myVal: String = "Foo" //val str: String = "Foo"

    var myVarInt = 10
    val myValString = "Hello, Scala!"

    val i, j = 100
    val (x1, x2) = (100, 200)
    val (y1, y2) = (100, "hello")
    val tuple: (Int, String) = (100, "hello")

    print(s"myVarInt:${myVarInt}   myValString:${myValString}")
    // myValString=""
    print(
      s"""
         |x1,x2=${x1},${x2}
         |tuple=${tuple}
         |t1=${tuple._1}
         |t2=${tuple._2}
       """.stripMargin)
  }

  @Test
  def operation(): Unit = {
    //重载运算符
    val a: Int = 10
    val b: Int = 20
    println("a + b = " + a + b)
    println("a + b = " + a.+(b))

    class MyInt(x: Int) {
      def +(i: Int): Int = {
        println("我重载了一个加号")
        x + i
      }
    }
    print(new MyInt(1).+(1))

  }

  @Test
  def loop(): Unit = {
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
