package lms_129

fun task3(number: Int): Int {

    var result = 1
    for (i in number downTo 1)
            result = result * i

    println("fact: $result")

    return result
}

fun main() {
    val result = task3(5)


}