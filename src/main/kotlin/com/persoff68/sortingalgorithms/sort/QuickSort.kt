package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class QuickSort : AbstractSort() {
    override fun getName(): String = "Quick sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()
        ArrayUtil.shuffle(arr)

        quickSort(arr, 0, arr.size - 1)

        return arr
    }

    private fun quickSort(arr: IntArray, l: Int, r: Int) {
        if (l < r) {
            val pivot = partition(arr, l, r)
            quickSort(arr, l, pivot - 1)
            quickSort(arr, pivot + 1, r)
        }
    }

    private fun partition(arr: IntArray, l: Int, r: Int): Int {
        val pivot = arr[r]
        var i = l - 1

        for (j in l until r) {
            if (arr[j] < pivot) {
                i++
                ArrayUtil.swap(arr, i, j)
            }
        }
        ArrayUtil.swap(arr, i + 1, r)

        return i + 1
    }
}
