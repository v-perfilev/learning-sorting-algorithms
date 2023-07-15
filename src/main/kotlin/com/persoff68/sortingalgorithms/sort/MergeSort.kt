package com.persoff68.sortingalgorithms.sort

class MergeSort<T : Comparable<T>>(comparator: Comparator<T>) : AbstractSort<T>(comparator) {
    override fun getName(): String = "Merge sort"

    override fun sort(inputArr: Array<T>): Array<T> {
        val arr = inputArr.copyOf()

        mergeSort(arr, 0, arr.size - 1)

        return arr
    }

    private fun mergeSort(arr: Array<T>, l: Int, r: Int) {
        if (l < r) {
            val m = (l + r) / 2
            mergeSort(arr, l, m)
            mergeSort(arr, m + 1, r)
            merge(arr, l, m, r)
        }
    }

    private fun merge(arr: Array<T>, l: Int, m: Int, r: Int) {
        val n1 = m - l + 1
        val n2 = r - m

        val lArr = List(n1) { arr[l + it] }
        val rArr = List(n2) { arr[m + 1 + it] }

        var i = 0
        var j = 0
        var k = l

        while (i < n1 && j < n2) {
            if (comparator.compare(lArr[i], rArr[j]) <= 0) {
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
