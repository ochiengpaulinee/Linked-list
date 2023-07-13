import javax.swing.text.Position

fun main(){

  val head = createLinkedList()
    val insertNode = Node("Bridget")
    insertAtPosition(5,head,insertNode)
    val newHead = insertAtHead(Node("Adalab"), head)
//    traverseList(newHead)
    val middle = getMiddleNode(head)
    println(middle)
}

class Node(var name:String){
    var next: Node? =null
}

fun createLinkedList():Node{
    val node1  =Node("Diana")
    val node2 = Node("Maurine")
    val node3  =Node("Clever")
    val node4  =Node("Ivy")
    val node5  =Node("Nyeliep")
    val node6  =Node("Cynthia")
    val node7  =Node("Marion")
    val node8  =Node("Rose")


    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = node8

    return node1
}

fun traverseList(head: Node){
    var current:Node?  = head

    while (current!=null){
        println(current.name)
        current = current.next
    }
}


fun insertAtPosition(position:Int, head:Node, nodeToInsert:Node): Node {
    var counter = 1
    var current:Node? = head

    while (counter<position-1){
        current = current?.next
        counter++
    }
    nodeToInsert.next = current?.next
    current?.next = nodeToInsert


    return head
}

fun insertAtHead(nodeToInsert: Node, head: Node):Node{
    nodeToInsert.next = head
    return nodeToInsert
}

fun getMiddleNode(head: Node):Node{
    var fast:Node? = head
    var slow:Node? = head

    while (fast?.next !=null){
        fast = fast.next?.next
        slow = slow?.next
    }
    return slow!!
}

fun generatePairs(nums:IntArray):MutableList<IntArray>{
    var result = mutableListOf<IntArray>()
    for (i in 0..nums.lastIndex){
        for (j in 0..nums.lastIndex){
            result.add(intArrayOf(i,j))
        }
    }
    return result
}
//
////    setting the entry point as the first element
//    var current:Node? = node1
//
////    traverse the elements by checking if  the next pointer is not null
////    if it is not null then move to the next element
//    while (current != null){
//        println(current.name)
//        current = current.next
//    }