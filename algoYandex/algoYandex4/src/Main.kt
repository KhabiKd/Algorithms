fun financing(f: String, s: String, t: String){
    val numberOfBranches = f.split(" ")[0]
    val sum = f.split(" ")[1]

    val effective: List<String> = s.split(" ")

    val a = t.split(" ")
    val hm: HashMap<String, String> = hashMapOf("" to "")
}


fun main(){
    val first = readLine().toString()
    val second = readLine().toString()
    val third = readLine().toString()

    financing(first, second, third)

}