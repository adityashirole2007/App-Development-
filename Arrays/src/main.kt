fun main() {
    val names = arrayOf("aadi", "krishna", "Raj", "Sakshi")
    for (i in 0..3) {
        println(names[i])
    }
    names[0] = "Aaditya"
    println(names[0])
    println(names.size)
    val mixedELEMENT = arrayOf(4,5,7,8,6,"Aadi",'a')
//    for ( i in numbers) {
//        println(i)
//    }
    for ( i in mixedELEMENT) {
        if(i is Int ) { // i is String or i is char
            println(i)
        }
    }
} // koi name ager har jagah se cahnge karna ho to do right click AND rename 