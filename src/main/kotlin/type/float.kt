package type

fun main() {

}

private fun setFloat() {
    // 부동소수점 수 리터럴 중 가장 단순한 형태는 10진 소수 형태로, 정수 부분과 소수 부분을 나눠 소수점을 찍어 놓았다.
    val pi = 3.14
    val one = 1.0

    // 정수 부분이 비어있는 경우 정수 부분을 0으로 간주한다. 하지만 소수점을 남기면서 소수 부분을 생략할 수는 없다.
    val quarter = .25   // 0.25
//    val one = 1.   // Error: Excepting an element
    val two = 2 // 오류는 아니지만, 정수 리터릴이다.

    // 코틀린은 과학적 표기법 리터럴을 허용한다. 과학적 표기법에서는 `e`나 `E` 뒤에 10을 몇번 거듭제곱하는지를 알려주는 숫자가 온다.
    val pi1 = 0.314E1   // 3.14
    val pi100 = 0.314E3 // 314.0
    val piOver100 = 3.14E-2 // 0.0314
    val thousand = 1E3  // 1000.0
}