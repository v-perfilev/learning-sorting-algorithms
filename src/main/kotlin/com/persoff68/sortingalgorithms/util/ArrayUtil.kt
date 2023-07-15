package com.persoff68.sortingalgorithms.util

import java.util.Random

class ArrayUtil {
    companion object {
        fun generateArray(size: Int, min: Int = -100, max: Int = 100): IntArray {
            val random = Random()
            return IntArray(size) { random.nextInt(min, max) }
        }

        fun shuffleArray(inputArr: IntArray): IntArray {
            val arr = inputArr.copyOf()
            val random = Random()
            for (i in arr.size - 1 downTo 1) {
                val j = random.nextInt(i + 1)
                swap(arr, i, j)
            }
            return arr
        }

        fun swap(arr: IntArray, a: Int, b: Int) {
            val temp = arr[a]
            arr[a] = arr[b]
            arr[b] = temp
        }
    }
}
