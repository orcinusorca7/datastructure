public class queue {
    private int[] numbers;

    public boolean empty(){

        return numbers == null;
    }

    public void enqueue(int number){

        if (numbers == null){
            numbers = new int[1];
            numbers[0] = number;
        }
        else{
            int[] temp = new int[numbers.length + 1];
            for (int i=0; i< numbers.length; i++){
                temp[i] = numbers[i];
            }
            temp[temp.length -1] = number;
            numbers = temp;
        }
    }

    public void dequeue(){
        if (numbers == null)
        { System.err.println("empty stack");
            return;
        }else if (numbers.length==1){
            numbers= null;
            return;
        }
        int[] temp = new int [numbers.length-1];
        for (int i=0; i< temp.length; i++)
        {
            temp[i] = numbers[i+1];
        }
        numbers = temp;
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


    public int peek (){
        if (empty())
        {
            System.out.println("queue is empty");

        }

        return numbers[numbers.length-1];
    }
}
