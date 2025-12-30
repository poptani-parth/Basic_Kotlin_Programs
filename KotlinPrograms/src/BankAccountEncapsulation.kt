//Create a class ‘BankAccount’ with a private property ‘balance’ and public methods
//deposit() and withdraw(). Demonstrate encapsulation.

class BankAccount{
    private var balance : Double = 0.0

    fun deposit(amount: Double){
        if(amount > balance){
            balance += amount
            println("Deposited $amount")
            println("Balance :  $balance")
        }
        else{
            println("Deposite amount must be Positive")
        }
    }

    fun withdraw(amount: Double){
        if(amount > 0 && amount <= balance){
            balance -= amount
            println("Withdrawed $amount")
            println("Balance : $balance")
        }
        else{
            println("Invalid amount / Insufficient balance")
        }
    }

    fun getBalance():Double{
        return balance
    }
}
fun main(){
    var bankAccount = BankAccount()
    bankAccount.deposit(1000.0)
    bankAccount.withdraw(300.0)
    println("Final Balance is ${bankAccount.getBalance()}")
}