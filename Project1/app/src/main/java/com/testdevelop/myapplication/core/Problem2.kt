package com.lastinventor.Urbanote.core

import com.lastinventor.Urbanote.core.ListNode.ListNode

class Problem2 {

    fun runTest(){
        var list1: ListNode? = ListNode.createListNode(intArrayOf (5,2,8))
        var list2: ListNode? = ListNode.createListNode(intArrayOf(7,1,4))

        var sumList = addTwoNumbers(list1, list2)
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result: ListNode? = ListNode(7)

        return result
    }
}