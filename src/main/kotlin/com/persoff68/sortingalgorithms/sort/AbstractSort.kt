package com.persoff68.sortingalgorithms.sort

import kotlin.system.measureTimeMillis

abstract class AbstractSort<T : Comparable<T>>(val comparator: Comparator<T>) : Sort<T> {
    fun apply(arr: Array<T>, printResult: Boolean = true) {
        val result: Array<T>
        val time = measureTimeMillis { result = this.sort(arr) }
        val str = if (printResult) {
            "${this.getName()} (${time}ms): ${result.contentToString()}"
        } else {
            "${this.getName()}: ${time}ms"
        }
        println(str)
    }
}
