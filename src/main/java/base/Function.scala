package base

import java.util.Date

import org.junit.Test

class Function {
  @Test
  def callByName(): Unit = {
    def dogSay(alias: String = "er ha"): String = {
      s"${alias}:wang wang "
    }

    def catSay(alias: String): String = {
      s"${alias}: miao miao"
    }

    def say(t: => String) = {
      println(t)
    }

    say(dogSay())
    say(catSay("hello kitty"))

  }

  @Test
  //偏应用函数
  def partialAppliedFunction(): Unit = {

    def log(date: Date, message: String) = {
      println(date + "----" + message)
    }

    val date = new Date
    val logWithDateBound= {
      log(date, _: String)
    }

    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)
    logWithDateBound("message3")
  }
}
