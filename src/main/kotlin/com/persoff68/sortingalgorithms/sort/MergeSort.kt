package com.persoff68.sortingalgorithms.sort

class MergeSort : AbstractSort() {
    override fun getName(): String = "Merge sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()

        mergeSort(arr, 0, arr.size - 1)

        return arr
    }

    private fun mergeSort(arr: IntArray, l: Int, r: Int) {
        if (l < r) {
            val m = (l + r) / 2
            mergeSort(arr, l, m)
            mergeSort(arr, m + 1, r)
            merge(arr, l, m, r)
        }
    }

    private fun merge(arr: IntArray, l: Int, m: Int, r: Int) {
        val n1 = m - l + 1
        val n2 = r - m
        val lArr = IntArray(n1)
        val rArr = IntArray(n2)

        for (i in 0 until n1) {
            lArr[i] = arr[l + i]
        }
        for (i in 0 until n2) {
            rArr[i] = arr[m + 1 + i]
        }

        var i = 0
        var j = 0
        var k = l

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i]
                i++
            } else {
                arr[k] = rArr[j]
                j++
            }
            k++
        }

        while (i < n1) {
            arr[k] = lArr[i]
            i++
            k++
        }

        while (j < n2) {
            arr[k] = rArr[j]
            j++
            k++
        }
    }
}
