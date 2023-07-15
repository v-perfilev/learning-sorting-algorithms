package com.persoff68.sortingalgorithms.sort

import com.persoff68.sortingalgorithms.util.ArrayUtil

class HeapSort : AbstractSort() {
    override fun getName(): String = "Heap sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()

        val n = arr.size

        for (i in n / 2 - 1 downTo 0) {
            heapify(arr, n, i)
        }

        for (i in n - 1 downTo 1) {
            ArrayUtil.swap(arr, 0, i)
            heapify(arr, i, 0)
        }

        return arr
    }

    private fun heapify(arr: IntArray, n: Int, i: Int) {
        var largest = i
        val l = 2 * i + 1
        val r = 2 * i + 2

        if (l < n && arr[l] > arr[largest]) {
            largest = l
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r
        }

        if (largest != i) {
            ArrayUtil.swap(arr, i, largest)
            heapify(arr, n, largest)
        }
    }
}
