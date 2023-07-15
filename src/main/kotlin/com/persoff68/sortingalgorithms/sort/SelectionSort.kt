package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class SelectionSort : AbstractSort() {
    override fun getName(): String = "Selection sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()

        for (step in 0..arr.size - 2) {
            var minIndex = step
            for (i in step + 1 until arr.size) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i
                }
            }
            ArrayUtil.swap(arr, step, minIndex)
        }

        return arr
    }
}
