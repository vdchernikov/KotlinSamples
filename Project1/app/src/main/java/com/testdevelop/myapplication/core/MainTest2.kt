package com.lastinventor.Urbanote.core
import com.lastinventor.Urbanote.core.ListNode.ListNode

class MainTest2 {

    constructor (codeId: Int){
    }

    fun runTest1(){
        var list1: ListNode? = ListNode.createListNode(intArrayOf(1,2,4))
        var list2: ListNode? = ListNode.createListNode(intArrayOf(1,3,5))
        var list3: ListNode? = ListNode.createListNode(intArrayOf(1,2,3))

        var lists: Array<ListNode?> = arrayOf(list1, list2, list3)

        var result: ListNode? = mergeKLists(lists)
        // var result: ListNode? = mergeTwoLists(list1, list2)

        println("List:")
        printNodeList(result)
    }

    fun mergeKLists(lists: Array<ListNode?>): ListNode?{
        if (lists == null){
            return null;
        }

        var resArrayLists: ArrayList<ListNode?> = ArrayList()

        for (list in lists){
            if (list != null){
                var arrayList = createArrayList(list)

                resArrayLists?.addAll(arrayList)
            }
        }

        resArrayLists.sortBy { it?.`val` }

        // remade references of nodes

        if (resArrayLists == null || resArrayLists.size == 0) {
            return null;
        }

        for (i in 0..resArrayLists.size - 2){
            resArrayLists.get(i)?.next = resArrayLists.get(i + 1)
        }

        return resArrayLists.get(0)
    }

    fun mergeTwoLists (l1: ListNode?, l2: ListNode?) : ListNode?{

        var resArrayList: ArrayList<ListNode?> = ArrayList<ListNode?>()

        if (l1  != null){
            var array: ArrayList<ListNode?> = ListNode.createArrayList(l1)
            resArrayList.addAll(array)
        }

        if (l2  != null){
            var array: ArrayList<ListNode?> = ListNode.createArrayList(l2)
            resArrayList.addAll(array)
        }

        resArrayList.sortBy { it?.`val` }

        // remade references of nodes

        if (resArrayList == null || resArrayList.size == 0) {
            return null;
        }

        var resultListNodeArray: Array<ListNode?> = resArrayList.toTypedArray()

        for (i in 0..resArrayList.size - 2){
            resArrayList.get(i)?.next = resArrayList.get(i + 1)
        }

        return resArrayList.get(0)
    }

    fun printNodeList (list: ListNode?){
        println(list?.`val`)

        if (list?.next != null){
            printNodeList(list?.next)
        }
    }
}