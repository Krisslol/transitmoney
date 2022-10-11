fun main() {
    val amount = 5000
    val comission:Double = amount * 0.75 / 100
    val totalPrice = comission + amount
    if (comission<35) {
        println(amount + 35)
    } else
        println("Итоговая сумма вместе с комиссией:  $totalPrice")
}



