fun division(){
    println("-----------------------------------------------------------------------------------------------------")
}

fun main(args: Array<String>) {

    division()

//  Binary Search
    val bs = BinarySearch()
    println("Position in array: " + bs.binarySearch(99))

    division()

//  Selection Sort Array
    val ss = SelectionSort()
    println("Sorted array: " + ss.selectionSort())

    division()

//  Recursion
    val r = Recursion()
    print("Sequence: "); r.countdown(10)
    println("factorial: " + r.factorial(5))

    division()

//  Quick Sort
    val qs = QuickSort()
    println(qs.quickSort(listOf(10, 5, 2, 3)))

    division()

//  Hash Mape
    val hm = HashMape()
    println(hm.book)
    println(hm.book["apple"])

    hm.checkVoter("Tom")
    hm.checkVoter("Bob")
    hm.checkVoter("Tom")
    division()

//  Breadth First Search
    val bfs = BreadthFirstSearch()
    println(bfs.search("you"))
    division()

}
