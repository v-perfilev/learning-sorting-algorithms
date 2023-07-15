package com.persoff68.sortingalgorithms.sort

class ShellSort<T : Comparable<T>>(comparator: Comparator<T>) : AbstractSort<T>(comparator) {
    override fun getName(): String = "Shell sort"

    override fun sort(inputArr: Array<T>): Array<T> {
        val arr = inputArr.copyOf()

        val n = arr.size
        var interval = n / 2

        while (interval > 0) {
            var i = interval

            while (i < n) {
                val temp = arr[i]
                var j = i

                while (j >= interval && comparator.compare(arr[j - interval], temp) > 0) {
                    arr[j] = arr[j - interval]
                    j -= interval
                }

                arr[j] = temp
                i++
            }

            interval /= 2
        }

        return arr
    }
}
