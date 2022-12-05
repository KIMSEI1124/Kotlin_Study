package type

fun main() {
    setArray()
}

private fun setArray() {
    val a = emptyArray<String>()        // 원소 0개, String
    val b = arrayOf("hello", "world")   // 원소 2개, String
    val c = arrayOf(1, 4, 9)            // 원소 3개 , Int

    val size = readLine()!!.toInt()
    val squares = Array(size) { (it + 1) * (it + 1) }

    val operations = charArrayOf('+', '-', '/', '%')
    val intArray = IntArray(10) { (it + 1) * (it + 1) }

    val array1 = arrayOf(1, 2, 3, 4)
    array1[0]   // 1
    array1[3]   // 4

    val array2 = array1
    array2[0]   // 1

    val copyArray = array1.copyOf()
    copyArray[0]    // 1
    array1.copyOf(2)    // 뒤가 잘림: 1, 2
    array1.copyOf(5)    // 부족한 부분에 0이 채워짐: 1, 2, 3, 4, 0

    val array3 = intArrayOf(1, 2, 3) + 4    // 원소를 하나만 추가 : 1, 2, 3, 4
    val array4 = intArrayOf(1, 2, 3) + intArrayOf(5, 6) // 다른 배열을 추가 : 1, 2, 3, 5, 6

    intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3))  // true
}