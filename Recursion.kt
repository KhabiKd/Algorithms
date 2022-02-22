class Recursion {

    fun countdown(i: Int){
        if(i < 0){ return }
        var str: String = "$i, "
        if(i == 0){ println(str.removeRange(str.lastIndex - 1, str.lastIndex))}
        else{print(str)}
        countdown(i-1)
    }

    fun factorial(x: Int): Int = when(x){
            1 -> 1
            else -> x * factorial(x-1)
        }

}