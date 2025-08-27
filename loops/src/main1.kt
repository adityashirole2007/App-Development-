fun main() {
    var number = 0
//    while(number < 10) {
//        println(number)
//        number++
//    }
//    while(number < 10) println(number++) // same output
//    while(number < 10) println(++number) // 1 to 10 print hoga ab to

//    do {
//        println(number) // condition true ho ya false it will always print once
//    }while(number < 10)
//    while (number < 10 ) {
//        if(number == 7) {
//            continue
//        }
//        println(number)
//        number++
//    }
//    number = 0
//    while (number < 10 ) {
//        number++
//        if(number == 7) {
//            continue
//        }
//        println(number)
//    }
//    number = 0
//    while (number < 10 ) {
//        number++
//        if(number > 2 && number <= 8) { // if(number in 3..8 ) ye bhi chalega
//            continue
//        }
//        println(number)
//    }
    number = 0
    while (number < 10 ) {
        if(number == 7) {
            break
        }
        number++
        println(number)
    }
}