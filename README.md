# Algorithms
 Here I will publish the algorithms I have analyzed. Kotlin.

1) Binary Search. 
   The essence of the algorithm is simple. The input is a **SORTED** list of elements. And each time we compare the middle element of the list with a hidden number. If the two numbers match, then the algorithm returns the position of the half element. If the hidden number is greater than half the element, we consider the same list, but its beginning is now equal to the position of the middle element + 1, if the hidden number is less than the average, then we do not touch the beginning of the list, but change the end to an index equal to the position of the middle element - 1
