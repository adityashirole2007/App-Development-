fun main() {
    val max = findMAXandMIN(arrayOf(20, 39,255 ,65),true )
    val min = findMAXandMIN(arrayOf(20, 39,255 ,65),false )
    println(max)
    println(min)
}
fun findMAXandMIN(numbers: Array<Int>, searchMAX: Boolean): Int {
    var max = numbers[0]
    if(searchMAX) {
        for(number in numbers) {
            if( max < number) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if( max > number) {
                max = number
            }
        }
        return max
    }
}