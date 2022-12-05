package type

fun main() {
    setChar()
}

private fun setChar() {
    var z = 'z'
    val alpha = 'a'

    var tab = '\t'
    var backspace = '\b'
    var newline = '\n'
    var carriageReturn = '\r'
    var singleQuote = '\''
    var doubleQuote = '\"'
    var backslash = '\\'
    var dollarSign = '\$'

    val pi = '\u03c0' // π

    var a = 'a'
    var h = 'h'
    println(a + 5)  // f
    println(a - 5)  // \
    println(h - a)  // 7
    println(--h)    // g
    println(++a)    // b
}

