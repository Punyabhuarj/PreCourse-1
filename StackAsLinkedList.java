public class StackAsLinkedList {
    StackNode root; 

    static class StackNode { 
        int data; 
        StackNode next; 

        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 


    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null)
        {
            return true;
        }
        else{
            return false;
        }

    } 

    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode NewNode = new StackNode(data);
        System.out.println(NewNode.data + "pushed to stack");
        if(isEmpty())
        {
            root = NewNode;
        }
        else{
            StackNode tempNode = root;
            root = NewNode;
            root.next = tempNode;
        }
    } 

    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    if(isEmpty())
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else
    {
        int temp = root.data;
        root = root.next;
        return temp;
    }
    } 

    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return root.data;
        }
    } 

	//Driver code
    public static void main(String[] args) 
    { 

        StackAsLinkedList sll = new StackAsLinkedList(); 

        sll.push(10); 
        sll.push(20); 
        sll.push(30); 

        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println("Top element is " + sll.peek()); 
    
    
    }
}
