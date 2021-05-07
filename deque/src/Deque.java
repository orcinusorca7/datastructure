public class Deque {
    private int[] numbers;

    public boolean empty(){

        return numbers == null;
    }

    public int size(){
        return numbers.length;
    }



    public int peek (){
        if (empty())
        {
            System.out.println("queue is empty");

        }

        return numbers[numbers.length-1];
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
