fun main() {
    val user = User("Aditya")
//  val friend = User("Aakash","Patil",66)
    val friend = User("Ram", "Shine", 55)

    println("Name = ${user.name}")
    println("Name = ${user.lastname}")
    println("Name = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("Name = ${friend.lastname}")
    println("Name = ${friend.age}")

    friend.intro()
    user.intro()
    // var name = Car() empty constructor hai ya to default constructor
}

class User(var name: String, var lastname: String, var age: Int) { // primary constructor hai ye ander wla part

    constructor(name: String) : this(name, "No Lastname", 0) { //this ke ander ka jo name hai vo constructor ke through mila hai
        println("2nd")
    }constructor(name: String, lastname: String) : this(name, lastname, 0) {
        println("3rd")
    }
    fun intro() {
        println("$name \n$lastname \n$age")
    }
}