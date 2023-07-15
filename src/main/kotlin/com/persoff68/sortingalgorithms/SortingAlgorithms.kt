package com.persoff68.sortingalgorithms

import com.persoff68.sortingalgorithms.sort.BubbleSort
import com.persoff68.sortingalgorithms.sort.HeapSort
import com.persoff68.sortingalgorithms.sort.InsertionSort
import com.persoff68.sortingalgorithms.sort.MergeSort
import com.persoff68.sortingalgorithms.sort.QuickSort
import com.persoff68.sortingalgorithms.sort.SelectionSort
import com.persoff68.sortingalgorithms.util.ArrayUtil

fun main() {
    val arr = ArrayUtil.generate(10000)

    // Bubble sort
    BubbleSort().apply(arr)

    // Selection sort
    SelectionSort().apply(arr)

    // Insertion sort
    InsertionSort().apply(arr)

    // Merge sort
    MergeSort().apply(arr)

    // Quick sort
    QuickSort().apply(arr)

    // Heap sort
    HeapSort().apply(arr)
}

