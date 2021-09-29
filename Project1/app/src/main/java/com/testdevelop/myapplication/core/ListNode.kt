package com.lastinventor.Urbanote.core.ListNode

class ListNode(var `val`: Int){
    var next: ListNode? = null

    companion object {
        fun
                createListNode(arr1: IntArray) : ListNode?{
            var firstNode: ListNode? = null
            var prevNode: ListNode? = null

            for(id in arr1){
                var list1: ListNode = ListNode(id)
                if (firstNode == null){
                    firstNode = list1
                }

                if (prevNode != null){
                    prevNode.next = list1
                }

                prevNode = list1
            }

            return firstNode
        }

        fun createArrayList(list: ListNode?): ArrayList<ListNode?>{
            var currentNode: ListNode? = list
            var resultArray: ArrayList<ListNode?> = ArrayList()

            do{
                resultArray.add(currentNode)
                currentNode = currentNode?.next

            }while (currentNode != null)

            return resultArray
        }
    }
}