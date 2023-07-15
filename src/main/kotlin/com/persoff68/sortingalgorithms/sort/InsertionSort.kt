package com.persoff68.sortingalgorithms.sort

class InsertionSort : AbstractSort() {
    override fun getName(): String = "Insertion sort"

    override fun sort(inputArr: IntArray): IntArray {
        val arr = inputArr.copyOf()

        for (step in 1 until arr.size) {
            val key = arr[step]
            var j = step - 1

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j]
                j--
            }

            arr[j + 1] = key
        }

        return arr
    }
}
