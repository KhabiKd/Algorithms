class HashMap {
    val book = hashMapOf<String, Double>(
        "apple" to 0.67,
        "milk" to 1.49,
        "avocado" to 1.49
    )

    val voted = hashMapOf<String, Boolean>()

    fun checkVoter(name: String){
        if(!voted.containsKey(name)){
            voted.put(name, true)
            println("let them vote!")
        }
        else{
            println("Kick them out!")
        }
    }
}