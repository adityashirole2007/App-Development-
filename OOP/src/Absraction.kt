// hiding complex details and showing only important features

abstract class Vehicle{
// kuch bhi ager jaber dasti thusna ho to use abstract class
    abstract fun  engine()
    fun horn() {
        println("peep peep")
    } // ek chij ka code mein 100 baar nahi likhunga is liye
}
class Car:Vehicle() {
    override fun engine() {
        println("car engine model = c100 ")
    }
}
class Bike:Vehicle() {
    override fun engine() {
        println("Bike engine model = b100 ")
    }
}

fun main() {
//    val vehicle = Vehicle()  nhi use kar sakte bhai abstract class ki vastu
    var car = Car()
    var bike = Bike()

    car.engine()
    car.horn()
    bike.horn()
    bike.engine()
}