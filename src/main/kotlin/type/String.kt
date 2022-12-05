package type

import java.util.Date

fun main() {
    setString()
}

private fun setString() {
    val hello = "Hello, world!"

    val text = "Hello, world!\nThis is \"multiline\" String"
    println(text)

    val name = "Kim"
    println("Hello, $name!\nToday is ${Date()}")

    println("Hello!".length)    // 6
    println("Hello!".lastIndex) // 5

    val s = "Hello!"
    println(s[0])           // H
    println(s[s.lastIndex]) // !

    val number = 10
    val sum = "The sum is: $number" // The sum is: 10

    val s1 = "Hello!"
    val s2 = "Hel" + "lo!"
    println(s1 == s2)   // true
}