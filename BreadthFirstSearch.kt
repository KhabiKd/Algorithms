import java.util.*


class BreadthFirstSearch{
    private val graph: Map<String, MutableList<String>> = hashMapOf(
        "you" to arrayListOf("alice", "bob", "claire"),
        "bob" to arrayListOf("anuj", "peggy"),
        "alice" to arrayListOf("peggy"),
        "claire" to arrayListOf("thom", "jonny"),
        "anuj" to arrayListOf(),
        "peggy" to arrayListOf(),
        "thom" to arrayListOf(),
        "jonny" to arrayListOf()
    )

    fun search(name: String): Boolean{
        var searchQueue: Queue<String> = ArrayDeque(graph[name])
        var searched: MutableList<String> = ArrayList()
        while (!searchQueue.isEmpty()) {
            val person = searchQueue.poll()
            // Only search this person if you haven't already searched them
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    println("$person is a mango seller!")
                    return true
                } else {
                    searchQueue.addAll(graph[person]!!)
                    // Marks this person as searched
                    searched.add(person)
                }
            }
        }
        return false;
    }

    private fun person_is_seller(name: String): Boolean {
        return name.endsWith("m")
    }
}