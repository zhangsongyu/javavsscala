package scala.variable

import org.junit.Test

/**
  * 变量 常量 的声明赋值操作
  */
object VariableS {
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
}
