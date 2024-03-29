package com.persoff68.sortingalgorithms.util

import java.util.Random

class ArrayUtil {
    companion object {
        fun generate(size: Int, min: Int = -100, max: Int = 100): Array<Int> {
            val random = Random()
            return Array(size) { random.nextInt(min, max) }
        }

        fun <T> shuffle(arr: Array<T>) {
            val random = Random()
            for (i in arr.size - 1 downTo 1) {
                val j = random.nextInt(i + 1)
                swap(arr, i, j)
            }
        }

        fun <T> swap(arr: Array<T>, a: Int, b: Int) {
            val temp = arr[a]
            arr[a] = arr[b]
            arr[b] = temp
        }
    }
}
