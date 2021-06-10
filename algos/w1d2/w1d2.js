class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
        this.nodeCounter= 0;
    }

    // if data is contained within the current list, delete it.
    // return void
    // assume there are no duplicates
    // consider the edge case if you have to delete the head node
    // consider the edge case your list is empty
    // consider the edge case that your list does not contain the data at all
    delete(data) {
        var runner = this.head;

        if(this.isEmpty()){
            return false;
        }
        if(data === runner.data){
            this.removeFromFront();
            return true;
        }
        while(runner){
            if(data === runner.next.data){
                runner.next = runner.next.next;
                this.nodeCounter--;
                return null;
            }
            runner = runner.next;
        }
        return false;
    }

    // return the size of the current linked list
    // BONUS: how might you do this without linearly traversing the list?
    // you may have change other methods within this class...
    size() {
        return this.nodeCounter;
    }



    // console log (print) the data of every node in the current list
    // traversal
    read() {
        var runner = this.head;
        while(runner){
            console.log(runner.data);
            runner = runner.next;
        }
    }

    // find: return true / false if current list contains a data equal to value
    contains(value) {
        var runner = this.head;
        while(runner){
            if(runner.data===value){
                return true;
            }
            runner = runner.next;
        } return false;
    }

    // Remove from front: remove and return the first node in the SLL
    removeFromFront() {

        var temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        // console.log(temp);
        this.nodeCounter--;

        return temp;
    }

    // -------------------------------------------
    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(node) {
        node.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
        this.nodeCounter++;
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
        this.nodeCounter++;
    }
}

// ⚠ don't forget to instantiate the Singly Linked List

// 1
// var n1 = new Node(11);
// var n2 = new Node(22);
// var n3 = new Node(33);

// n1.next = n2;
// n2.next = n3;
// // n1.next.next = n3;
// // console.log({n1});
// // console.log({n2});
// // console.log({n3});

// // 2
// var mySLL = new SLL();
// mySLL.head = new Node(11);
// mySLL.head.next = new Node(22);
// mySLL.head.next.next = new Node(33);
// // console.log(mySLL);

// 3
var myReadSLL = new SLL();
myReadSLL.addToFront(new Node(100));
myReadSLL.addToFront(new Node(200));
myReadSLL.addToFront(new Node(300));
// myReadSLL.addToFront(new Node(400));
// myReadSLL.addToFront(new Node(500));
// myReadSLL.addDataToFront(new Node(500));
console.log(myReadSLL);

myReadSLL.read();
if(myReadSLL.contains(100)){
    console.log("true");
};

myReadSLL.removeFromFront()
// console.log(myReadSLL.removeFromFront());
console.log(myReadSLL);
myReadSLL.delete(100);
console.log(myReadSLL);
myReadSLL.addToFront(new Node(100));
console.log(myReadSLL);
myReadSLL.delete(100);
console.log(myReadSLL);