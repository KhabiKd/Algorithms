fun fareCost(cot: Int, nom: Int, oem: Int, nonmm: Int): Int{
    var cost: Int
    if(nonmm > nom){ cost = cot + (nonmm - nom) * oem }
    else { cost = cot }
    return cost
}

fun main(){

    val inputData = readLine()!!.split(" ")

    val costOfTraffic = inputData[0].toInt()
    val numOfMegabytes = inputData[1].toInt()
    val oneExtraMegabyte = inputData[2].toInt()
    val numOfNextMonthMegabytes = inputData[3].toInt()

    println(fareCost(costOfTraffic, numOfMegabytes, oneExtraMegabyte, numOfNextMonthMegabytes))
}