// code ke ander ki gandgi kam karta hai basically ye code
open class Animal{
    open fun makesound() {
        println("koi Awwz nahi!")
    }
}
class Dog: Animal() {
    override fun makesound() {
        println("woof woof")
    }
}
class Cat: Animal() {
    override fun makesound() {
        println("meow meow")
    }
}

fun main() {

    val animal1:Animal = Dog()
    val animal2:Animal = Cat()
    animal1.makesound()
    animal2.makesound()
}