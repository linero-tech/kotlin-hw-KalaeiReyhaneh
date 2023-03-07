package lms_129

fun task4(): Int {

    var result = 0
    for (number in 1..1000)
        if (number%9 == 0)
            result = result + number

    println("fact: $result")

    return result

}
fun main() {
    val result = task4()


}