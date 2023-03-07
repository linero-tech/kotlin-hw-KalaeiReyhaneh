package lms_129

fun task7(a: Int, b: Int): Int {

    var c = 1
    if (a != b )
        for (number in 1..b)
            c = c * a

    return c
}

fun main()  {
    val result = task7(2, 2)
    println("$result")


}