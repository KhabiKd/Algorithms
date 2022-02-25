fun luckyNumber(number: String): String{

    val lucky_number_initially: String = number
    var lucky_number = number.toInt()
    val lucky_number_str: String

    var first = number.subSequence(0,3).toString().toInt()
    var second = number.subSequence(3, 6).toString().toInt()

    var sumFirst = first/100 + (first/10)%10 + first%10
    var sumSecond = second/100 + second/10%10 + second%10

    if(sumFirst > sumSecond || sumFirst < sumSecond){
        while (sumFirst != sumSecond){
            second += 1
            if(second == 1000) { first += 1; sumFirst += 1; second = 0 }
            sumSecond = second/100 + second/10%10 + second%10
        }

        val firstStr: String
        if(first < 10){ firstStr = "00$first"}
        else if( first in 10..99) { firstStr = "0$first"}
        else { firstStr = first.toString() }
        val secondStr: String
        if(second < 10){ secondStr = "00$second"}
        else if( second in 10..99) { secondStr = "0$second"}
        else { secondStr = second.toString() }
        lucky_number_str = (firstStr + secondStr)
    }

    else{ return lucky_number_initially }

    return lucky_number_str
}

fun main(){
    val num: String = readLine().toString()
    println(luckyNumber(num))
}