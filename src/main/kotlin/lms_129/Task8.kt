package lms_129

fun task8(number: Int): Int {
    var sum = 0
    var num = number
    //var reversed = 0

    while (num != 0) {
        val digit = num % 10
        sum = sum + digit
        //reversed = reversed * 10 + digit
        num /= 10
    }

    return sum

}

fun main()  {
    val result = task8(1111)
    println("$result")


}