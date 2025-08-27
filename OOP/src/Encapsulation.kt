// sensitive data hide karna hai
class BankAccount {

    private var balance: Double = 0.0
    private var accountHolder: String = ""
    // setter
    fun setAccountHolder(name :  String) {
        if (name.isNotEmpty()) {
            accountHolder = name
        } else {
            println("Naam nahi hai kya tera")
        }
    }
    fun getAccountHolder() : String {
        return accountHolder
    } // setter
    fun deposit(amount:Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Paisa dal Lavde")
        }
    } // getter
    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()
    account.setAccountHolder("Aditya Shirole")
    println("Account Holder : ${account.getAccountHolder()}")

//    account.deposit(1000.00)
//    println("Current Balance = ${account.getBalance()} ")

    account.deposit(1000.0)
    println("Current Balance = ${account.getBalance()}")

//    account.balance = 10
}