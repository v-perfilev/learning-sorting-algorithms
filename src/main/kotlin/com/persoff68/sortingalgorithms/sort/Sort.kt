package com.persoff68.sortingalgorithms.sort

interface Sort<T : Comparable<T>> {
    fun getName(): String
    fun sort(inputArr: Array<T>): Array<T>
}
