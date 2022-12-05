package type

fun main() {
    setCompare()
}

private fun setCompare() {
    val a = 1
    val b = 2
    println(a == 1 || b != 1)   // true
    println(a >= 1 && b < 3)    // true
    println(a < 1 || b < 1)     // false
    println(a > b)              // false

    val one = 1
    val two = 2L
//    println(one == two)             // Error: comparing Int and Long
    println(one.toLong() == two)    // OK
}