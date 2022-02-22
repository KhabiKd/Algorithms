# Algorithms
 Here I will publish the algorithms I have analyzed. Kotlin.

1) Binary Search. 
   The essence of the algorithm is simple. The input is a **SORTED** list of elements. And each time we compare the middle element of the list with a hidden number. If the two numbers match, then the algorithm returns the position of the half element. If the hidden number is greater than half the element, we consider the same list, but its beginning is now equal to the position of the middle element + 1, if the hidden number is less than the average, then we do not touch the beginning of the list, but change the end to an index equal to the position of the middle element - 1

2) Selection Sort.
   The essence of the algorithm is as follows: first, create a function that returns the index of the smallest element in the array (we will use it in the sort function itself).
Sorting function: Each time we go through the list and look for the minimum (maximum, depending on the task) element and write it to a new list. At the same time, we remove this element from the old list. Selection sort has an easy algorithm, but a long time (increasing function of n^2 operations)

3) Recursion. Recursion function - a function that calls itself. Recursion allows the programmer to save time, that is, he does not have to write cycles. But there are cases when, due to recursion, the stack overflows or take up a lot of memory. Then you need to write cycles instead of recursion.
