package com.persoff68.sortingalgorithms.util

class TimeUtil {
    companion object {
        inline fun measureTimeMillis(block: () -> Unit): Long {
            val start = System.currentTimeMillis()
            block()
            return System.currentTimeMillis() - start
        }
    }
}
