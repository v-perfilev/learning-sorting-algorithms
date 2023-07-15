package com.persoff68.sortingalgorithms.sort

import kotlin.system.measureTimeMillis

abstract class AbstractSort : Sort {
    fun apply(arr: IntArray, printResult: Boolean = false) {
        val result: IntArray
        val time = measureTimeMillis { result = this.sort(arr) }
        val str = if (printResult) {
            "${this.getName()} (${time}ms): ${result.contentToString()}"
        } else {
            "${this.getName()} (${time}ms)"
        }
        println(str)
    }
}
