package com.persoff68.sortingalgorithms

import com.persoff68.sortingalgorithms.sort.BubbleSort
import com.persoff68.sortingalgorithms.sort.SelectionSort
import com.persoff68.sortingalgorithms.sort.Sort
import com.persoff68.sortingalgorithms.util.ArrayUtil
import kotlin.system.measureTimeMillis

fun main() {
    val arr = ArrayUtil.generateArray(20)
    println("Initial array: ${arr.contentToString()}")

    // Bubble sort
    applySort(arr, BubbleSort())

    // Selection sort
    applySort(arr, SelectionSort())
}

fun applySort(arr: IntArray, sort: Sort) {
    val result: IntArray
    val time = measureTimeMillis { result = sort.sort(arr) }
    println("${sort.getName()} (${time}ms): ${result.contentToString()}")
}
