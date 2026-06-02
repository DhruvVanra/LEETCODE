import java.util.*;

class MyStack{
    Queue<Integer> q;
    public MyStack() {
       q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        
    }
}