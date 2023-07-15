package com.persoff68.sortingalgorithms.sort

import kotlin.system.measureTimeMillis

abstract class AbstractSort : Sort {
    fun apply(arr: IntArray) {
        val result: IntArray
        val time = measureTimeMillis { result = this.sort(arr) }
        println("${this.getName()} (${time}ms): ${result.contentToString()}")
    }
}
