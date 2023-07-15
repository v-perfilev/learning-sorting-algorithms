package com.persoff68.sortingalgorithms

import com.persoff68.sortingalgorithms.sort.BubbleSort
import com.persoff68.sortingalgorithms.sort.InsertionSort
import com.persoff68.sortingalgorithms.sort.SelectionSort
import com.persoff68.sortingalgorithms.util.ArrayUtil

fun main() {
    val arr = ArrayUtil.generateArray(20)
    println("Initial array: ${arr.contentToString()}")

    // Bubble sort
    BubbleSort().apply(arr)

    // Selection sort
    SelectionSort().apply(arr)

    // Insertion sort
    InsertionSort().apply(arr)
}

