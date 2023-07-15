package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class QuickSort<T : Comparable<T>>(comparator: Comparator<T>) : AbstractSort<T>(comparator) {
    override fun getName(): String = "Quick sort"

    override fun sort(inputArr: Array<T>): Array<T> {
        val arr = inputArr.copyOf()
        ArrayUtil.shuffle(arr)

        quickSort(arr, 0, arr.size - 1)

        return arr
    }

    private fun quickSort(arr: Array<T>, l: Int, r: Int) {
        if (l < r) {
            val pivot = partition(arr, l, r)
            quickSort(arr, l, pivot - 1)
            quickSort(arr, pivot + 1, r)
        }
    }

    private fun partition(arr: Array<T>, l: Int, r: Int): Int {
        val pivot = arr[r]
        var i = l - 1

        for (j in l until r) {
            if (comparator.compare(arr[j], pivot) < 0) {
                i++
                ArrayUtil.swap(arr, i, j)
            }
        }
        ArrayUtil.swap(arr, i + 1, r)

        return i + 1
    }
}
