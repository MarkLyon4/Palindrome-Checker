
public class Queue {
	Node front;
    Node back;
    Queue() {
    	front = back = null; //starts with empty queue
    }
    public boolean isEmpty(){ //checks if the queue is empty.
    	if (front == null && back == null){
    		return true;
    	}else{
    		return false;
    	}
    }
    public void enqueue(char c){ //adds a node to the end of the queue.
    	Node n = new Node(c);
    	if (isEmpty()){ //Empty queue
    		front = back = n;
    	}
    	else if (front == back & front != null) {//One node already in queue
    		back = n;
    		front.next = n;
    	}
    	else{ //More than one node already in queue
    		back.next = n;
    	    back = n;
    	}
    }
    public Node dequeue(){ //removes a node from the beginning of the queue.
    	Node temp = front;
    	front = front.next;
    	return temp;
    }
}
