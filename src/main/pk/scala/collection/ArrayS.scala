package scala.collection

import org.junit.Test

object ArrayS {
  @Test
  def array(): Unit = {
    var z = new Array[String](3)
    z(0) = "Runoob"
    z(1) = "Baidu"
    z(4 / 2) = "Google"
    var z2 = Array("Runoob", "Baidu", "Google")
    z.foreach(company => println(company))
    println(z2(0))
    println(z2(3))

  }
}
