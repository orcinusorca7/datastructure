public class queue {
    private int[] numbers;

    public boolean empty(){

        return numbers == null;
    }

    public void clear(){

        numbers = null;

    }

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

    public int size(){
        return numbers.length;
    }


}
