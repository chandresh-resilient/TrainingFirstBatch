public class CallStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // LIFO
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        
        stack.top();
        stack.pop();

        stack.top();
        stack.pop();
        
        stack.pop();


    }
}
