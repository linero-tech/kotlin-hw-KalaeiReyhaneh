package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    //println("Enter first integer number:")
    //val valueForA = readln()
    //println("Enter second integer number:")
    //val valueForB = readln()

    println("before swap:a =  $a, b: $b")


    var c = a
    a = b
    b = c

    println("After Swap: a = $a, b: $b")



    // Do not erase or change this statement
    return Pair(a, b)
}
fun main()  {
    val result = task5(4,2)
}