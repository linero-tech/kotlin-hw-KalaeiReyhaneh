package lms_129

fun task1(a: Int, b: Int): Int {

    var sum = 0

    if (a<b)
    for (number in a..b)
        sum += number

    println("sum: $sum")


    return sum
}

fun main() {
    val result = task1(1,1)


}