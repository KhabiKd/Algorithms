fun minimumStairs(n: Int, m: Int, listOfStairs: List<String>, l: Int): Int{
    if(n != listOfStairs.size){ throw Exception("Illegal range")}
    else{

        var currentPosition = 0
        val arrayOfStairs: Array<String> = listOfStairs.toTypedArray()
        try{
            if(arrayOfStairs[l].toInt() - arrayOfStairs.first().toInt() > m){
                currentPosition = arrayOfStairs[l].toInt()
                currentPosition =
                    if(arrayOfStairs.last().toInt() - currentPosition >= currentPosition - arrayOfStairs.first().toInt()){
                        (currentPosition - arrayOfStairs.first().toInt()) * 2 + arrayOfStairs.last().toInt() - currentPosition
                    } else{
                        (arrayOfStairs.last().toInt() - currentPosition) * 2 + currentPosition - arrayOfStairs.first().toInt()
                    }
            }
            else{ return (arrayOfStairs.last().toInt() - arrayOfStairs.first().toInt()) }
        } catch(e: Exception){
            println(e.message)
        }
        return currentPosition
    }
}

fun main(){
    val str1 = readLine()!!.split(" ")
    val str2 = readLine()!!.split(" ")
    var leave = readLine()!!.toInt()
    if( leave != 1 ) { leave -= 1 }
    val n = str1[0].toInt()
    val minute = str1[1].toInt()

    println(minimumStairs(n, minute, str2, leave))

}