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

    public int size(){
        return numbers.length;
    }


    public void clear(){

        numbers = null;

    }

    public boolean contains(int number){
        if(empty()){
            return false;
        }
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }
}
