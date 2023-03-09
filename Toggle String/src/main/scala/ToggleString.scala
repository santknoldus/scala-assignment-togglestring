package com.knoldus.togglestring

object ToggleString {

  def main(args: Array[String]): Unit = {
    val string = scala.io.StdIn.readLine()
    try {
      val toggledString = toggleString(string)
      println(toggledString)
    } catch {
      case exception: Exception =>
        println("Error occurred: " + exception.getMessage)
    }
  }

  //function to convert uppercase to lowercase and vice-versa
  def toggleString(string: String): String = {
    var toggledString = ""
    for (stringChar <- string) {
      if (stringChar.isUpper) toggledString += stringChar.toLower
      else toggledString += stringChar.toUpper
    }
    toggledString
  }
}
