package lms_126

fun task8(): String {

    return """
     FOR number X
       IF X % 3 == 0 :
          print "Foo"
     FOR number x
       IF X % 5 == 0 :
          print "Bar"
     FOR number X
       IF X % 3 & % 5 == 0 :
          print "FooBar"
     FOR number X 
       IF X % 3 or % 5 == 0 :
          print "Qix"
          
    """
        .trimIndent()
}
