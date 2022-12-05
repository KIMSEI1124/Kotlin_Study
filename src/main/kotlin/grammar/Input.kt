package grammar

// 입력

fun main() {
    cmdReadLine()
}

private fun cmdReadLine() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println("a + b = " + (a + b))
}