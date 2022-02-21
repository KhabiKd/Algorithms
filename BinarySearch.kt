class BinarySearch {

    fun binarySearch(item: Int) : Int? {
        var min = 0
        var max = sortedArray.lastIndex
        while (min <= max) {
            val mid = (min + max)/2
            val guess = sortedArray[mid]
            if (guess == item) return mid
            if (guess > item) max = mid -1
            else min = mid + 1
        }
        return null
    }

    val sortedArray = (0..100 step 3).toList()

}