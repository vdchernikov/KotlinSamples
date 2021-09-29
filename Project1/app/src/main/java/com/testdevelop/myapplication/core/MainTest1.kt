package com.lastinventor.Urbanote.core

class MainTest1 {

    fun runTest1() {
        val testNums1 = intArrayOf(1,5,10,20,25)
        val testNums2 = intArrayOf(2,3,7,17,19,100)

        var median = findMedianSortedArrays(testNums1, testNums2)
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var result: Double = 0.0
        var mergedArray = mergeArrays(array1 = nums1, array2 = nums2)
        result = getMadian(mergedArray)
        return result
    }

    fun mergeArrays(array1: IntArray, array2: IntArray): IntArray {
        var result: IntArray = array1 + array2
        result.sort()
        // val result: IntArray = intArrayOf(1,2,3,5,7,10,17,19,20,25)

        return result
    }

    fun getMadian(array: IntArray): Double {

        if (array.size <= 0){
            return 0.0;
        }

        if (array.size == 1){
            return array[0].toDouble()
        }

        if (array.size.rem (2) == 0){
            var num1: Double = array[array.size.div(2)].toDouble()
            var num2: Double = array[array.size.div(2) - 1].toDouble()

            return (num1 + num2) / 2
        }
        else{
            var num1 = array[array.size.div(2)].toDouble()
            return num1
        }
    }

    fun testSort() {
        val arrayList: List<Int>
        val testAray1: IntArray = intArrayOf(45, 12, 87, 34, 67, 23, 34, 12, 11, 45, 78, 34)
        val testList2 = mutableListOf(4, 8, 2, 4, 9, 4, 2, 1, 6, 7, 3)

        testList2.sort()
        println("testList2")
        println(testList2)

        testAray1.sort()
        println("testAray1")
        println(testAray1)
    }
}