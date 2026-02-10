import java.util.*;
class MyQueue
{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    
    public void push(int x)
    {
        input.push(x);
    }
    
    public int pop()
    {
        peek();
        return output.pop();
    }
    
    public int peek()
    {
        if(output.isEmpty())
        {
            while(!input.isEmpty())
            {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty()
    {
        return input.isEmpty() && output.isEmpty();
    }
}
public class QueueUsingStack{
    public static void main(String args[])
    {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.empty());
        System.out.println(q.pop());
        System.out.println(q.empty());
        
    }
}
