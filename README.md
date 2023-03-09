# Toggle String

**Problem Statement:**

For a given String consisting of uppercase and lowercase English alphabets. Write a scala program to 
change the case of each alphabet in this String. That is, all the uppercase letters should be converted 
to lowercase and all the lowercase letters should be converted to uppercase.

**Code:**
```
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
```

**Output:**

![Screenshot from 2023-03-09 14-34-28](https://user-images.githubusercontent.com/125345690/223973164-f6652354-0e9a-4998-90ea-6e388fdd0f24.png)
