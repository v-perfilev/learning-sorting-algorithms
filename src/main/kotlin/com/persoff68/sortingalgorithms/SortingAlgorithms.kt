package com.persoff68.sortingalgorithms

import com.persoff68.sortingalgorithms.sort.BubbleSort
import com.persoff68.sortingalgorithms.sort.HeapSort
import com.persoff68.sortingalgorithms.sort.InsertionSort
import com.persoff68.sortingalgorithms.sort.MergeSort
import com.persoff68.sortingalgorithms.sort.QuickSort
import com.persoff68.sortingalgorithms.sort.SelectionSort
import com.persoff68.sortingalgorithms.sort.ShellSort
import com.persoff68.sortingalgorithms.util.ArrayUtil

fun main() {
    val arr = ArrayUtil.generate(10)

    val comp = Comparator(Integer::compare)

    // Bubble sort
    BubbleSort(comp).apply(arr)

    // Selection sort
    SelectionSort(comp).apply(arr)

    // Insertion sort
    InsertionSort(comp).apply(arr)

    // Merge sort
    MergeSort(comp).apply(arr)

    // Quick sort
    QuickSort(comp).apply(arr)

    // Heap sort
    HeapSort(comp).apply(arr)

    // Shell sort
    ShellSort(comp).apply(arr)
}

