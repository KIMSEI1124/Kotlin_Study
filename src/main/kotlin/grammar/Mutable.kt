package grammar

// 가변 함수

fun main() {
    assignment()
    augmentedAssignment()
}

private fun assignment() {
    var sum = 1
    sum = sum + 2
    sum = sum + 3
    println("assignment = $sum")
}

private fun assignmentException() {
    var sum = 1
    //    sum = "Hello"   // Error
}

private fun augmentedAssignment() {
    var sum = 1
    sum += 1
    println("augmentedAssignment = $sum")
}