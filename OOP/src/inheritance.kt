fun main() {
//    var grandparentshouse = Grandparents()
//    grandparentshouse.describe()
//
//    var parents = Parents()
//    parents.describe()

    var we = Us("Mordern")
    we.describe()
}
open class Grandparents() { // open diya kyuki baki pidi  usko inheritance kar sakhe
    var rooms = 1
    var material = "Mud"

    open fun describe() {
        println("$rooms \n$material")
    }
} // inheritance ke : lagna padta hai
open class Parents : Grandparents () {
    init {
        rooms = 3
        material = "Cement"
    }

    override fun describe() {
        println("$rooms \n$material")
    }
} // ye class kisi ko inheritance nahi karni hai to open nahi dala
class Us( var Types : String): Parents() {
    var type = Types

    init {
        rooms = 5
    }

    override fun describe() {
        super.describe()
        println("$rooms \n$Types")
    }
}