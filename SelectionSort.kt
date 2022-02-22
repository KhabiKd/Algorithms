class SelectionSort {
    val arr = arrayListOf(2, 0, 5, 1, 8, 23, 31, 21, 93, 213, 31, 11, 1512, 231, 341, 516, 132, 322, 421, 643)

    fun getSmallest(): Int{
        var smallest = arr[0]
        var index = 0
        for(i in 1 until(arr.size)){
            if(smallest > arr[i]){
                smallest = arr[i]
                index = i
            }
        }
        return index
    }

    fun selectionSort(): ArrayList<Int>{
        var sortedArr = arrayListOf<Int>()
        for(i in arr.indices){
            val indexOfSmallest = getSmallest()
            sortedArr += arr[indexOfSmallest]
            arr.removeAt(indexOfSmallest)
        }
        return sortedArr
    }
}