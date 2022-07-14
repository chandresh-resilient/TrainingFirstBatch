public class Stack {
    private int top = -1;
    private int[] arr = new int[2];

    public void push(int data)
    {
        if(top == arr.length-1){
            System.out.println("Stack is full");
        }else{
            arr[++top] = data;
            System.out.println("Element pushed successfully");
        }
    }
    public void pop()
    {
        if(top >= 0){
            int data = arr[top--];
            System.out.println("Your popped Element is : " + data);
        }else{
            System.out.println("Stack is empty");
        }
    }
    public void top()
    {   
        if(top >= 0){
            int data = arr[top];
            System.out.println("Your Top Element is : " + data);
        }else{
            System.out.println("Stack is empty");
        }
    }
}
