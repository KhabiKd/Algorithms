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
    val sa = SelectionSort()
    println("Sorted array: " + sa.selectionSort())

    division()
}
