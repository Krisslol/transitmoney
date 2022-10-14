fun main() {
    val amount = 400
    var comission:Double = amount * 0.0075
    val minComission = 35
    val res = if(minComission>comission) amount + minComission else amount + comission

    println(res)

}



