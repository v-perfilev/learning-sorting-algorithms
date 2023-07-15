package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class SelectionSort<T : Comparable<T>>(comparator: Comparator<T>) : AbstractSort<T>(comparator) {
    override fun getName(): String = "Selection sort"

    override fun sort(inputArr: Array<T>): Array<T> {
        val arr = inputArr.copyOf()

        for (step in 0..arr.size - 2) {
            var minIndex = step
            for (i in step + 1 until arr.size) {
                if (comparator.compare(arr[i], arr[minIndex]) < 0) {
                    minIndex = i
                }
            }
            ArrayUtil.swap(arr, step, minIndex)
        }

        return arr
    }
}
