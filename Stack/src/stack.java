import java.sql.SQLOutput;

public class stack
{
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

     public void push(){

     }

     public void pop(){

     }

     public int size(){
        return numbers.length;
    }

     public int peek (){
        if (empty())
        {
            System.out.println("stack is empty");

        }

        return numbers[numbers.length-1];
     }


     public boolean contain(int number){

         return false;
     }
}


