package lms_129

fun task6(number: Int): Int {

    var num = number
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

   return reversed

}

fun main()  {
    val result = task6(678)
    println("$result")


}
