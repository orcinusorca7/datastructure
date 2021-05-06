public class stackDemo {


    public static void main(String[] args) {
        stack Stack = new stack();
        System.out.println(Stack.empty());
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println(Stack.size());
        Stack.pop();
        Stack.peek();
        System.out.println(Stack.contains(40));
        Stack.clear();
        Stack.print();



    }
}
