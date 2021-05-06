public class queueDemo {
    public static void main(String[] args) {
        Queue Queue = new Queue();
        System.out.println(Queue.empty());
        Queue.enqueue(10);
        Queue.enqueue(20);
        Queue.enqueue(30);
        Queue.print();
        System.out.println(Queue.size());
        Queue.dequeue();
        Queue.print();
        Queue.peek();
        System.out.println(Queue.contains(40));
        Queue.clear();
        Queue.print();
    }
}
