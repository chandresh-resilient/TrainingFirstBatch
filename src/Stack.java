public class Stack {
    private int top = 0;
    private int[] arr = new int[20];

    public void push(int data)
    {
        arr[top++] = data;
        System.out.println("Element pushed successfully");
    }
    public void pop()
    {
        int data = arr[--top];
        System.out.println("Your popped Element is : " + data);
    }
    public void top()
    {
        int data = arr[--top];
        System.out.println("Your Top Element is : " + data);
    }
}
