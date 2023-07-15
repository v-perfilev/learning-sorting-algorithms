package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class BubbleSort : AbstractSort() {
    override fun getName(): String = "Bubble sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()

        for (i in 0..arr.size - 2) {
            for (j in 0..arr.size - i - 2) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swap(arr, j, j + 1)
                }
            }
        }

        return arr
    }
}
