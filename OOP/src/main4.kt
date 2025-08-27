fun main() {
    var name = Name("aadi shirole")
}
class Name( var name : String) {
    var formattedName = ""

    init {
        formattedName = name.uppercase()
        println(formattedName)
    }
}