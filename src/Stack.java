
public class Stack {
	Node top;
    Stack(){ //Stack starts empty
    	top = null;
    }
    public boolean isEmpty(){ //checks if stack is empty
    	if (top == null){
    		return true;
    	}else{
    		return false;
    	}
    }
    public void push(char c){ //puts a node on top of a stack
    	Node n = new Node(c);
    	if (isEmpty()){
    		top = n;
    	}else{
    		n.next = top;
    		top = n;
    	}
    }
    public Node pop(){ //takes a node from the top of the stack
    	Node temp = top;
    	top = top.next;
    	return temp;
    }
}
