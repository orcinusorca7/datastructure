public class DynamicArray {
    private int[] numbers;

    public void print(){
        if (empty()){
            System.out.println("[]");
            return;
        }

        System.out.println("[");
        for(int i= numbers.length-1; i>=0 ; i--){
            System.out.println(numbers[i] + ",");
        }
        System.out.println("\b\b]");
    }

    private boolean empty() {
        return numbers == null;
    }
}
