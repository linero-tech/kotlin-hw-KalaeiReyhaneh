package lms_129

fun task1(a: Int, b: Int): Int {

    var result = 0

    if (a<b)
    for (number in a..b)

        result += number

    println("sum: $result")


    return result
}

fun main() {
    val result = task1(1,5)


}