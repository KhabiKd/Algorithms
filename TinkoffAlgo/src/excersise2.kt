fun main(){

    val n = readLine()!!.toInt()
    var i = 0
    var d = 1

    while (n > d) {
        i += 1
        d *= 2
    }
    println(i)
}