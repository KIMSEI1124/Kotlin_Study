package type

fun main() {
    setBinary()
}

private fun setInt() {
    val n = 12345
    val large = 1_234_567
    println("n = $n")
    println("large = $large")
}

private fun setInt2() {
    val one: Byte = 1
//    val tooBigForShort: Short = 100_000 // Error: too big for short
    val million = 1_000_000
//    val tooBigForInt: Int = 10_000_000_000 // Error: too big for Int
    val tenBillions = 10_000_000_000
//    val tooBigForLong = 10_000_000_000_000_000_000 // Error: too big for Long
}

private fun setLong() {
    val hundredLong = 100L
//    val hundredInt: Int = 100L  // Error: assigning Long to Int
}

private fun setBinary() {
    val bin = 0b10101   // 21
    val hex = 0xF9  // 249
    println("bin = $bin")
    println("hex = $hex")
}