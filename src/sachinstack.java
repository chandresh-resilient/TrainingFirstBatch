public class sachinstack {
    private int topvar = 0;
    private int[] arr = new int[10];

    // pushing data 
    public void push(int data) {
        arr[topvar++] = data;
        System.out.println("Element pushed in stack");
    }

    // deleting data
    public void pop() {
        int data = arr[--topvar];
        System.out.println("popped element --> " + data);
    }

}
