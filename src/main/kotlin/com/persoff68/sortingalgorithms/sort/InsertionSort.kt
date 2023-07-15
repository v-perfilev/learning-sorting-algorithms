package com.persoff68.sortingalgorithms.sort

class InsertionSort<T : Comparable<T>>(comparator: Comparator<T>) : AbstractSort<T>(comparator) {
    override fun getName(): String = "Insertion sort"

    override fun sort(inputArr: Array<T>): Array<T> {
        val arr = inputArr.copyOf()

        for (step in 1 until arr.size) {
            val key = arr[step]
            var j = step - 1

            while (j >= 0 && comparator.compare(key, arr[j]) < 0) {
                arr[j + 1] = arr[j]
                j--
            }

            arr[j + 1] = key
        }

        return arr
    }
}
