import sun.misc.Queue;

class Deque extends Queue {

    private int[] numbers;

    public void enqueueRear(int number){  if (numbers == null){
        numbers = new int[1];
        numbers[0] = number;
    }
    else{
        int[] temp = new int[numbers.length + 1];
        for (int i=0; i< numbers.length; i++){
            temp[i] = numbers[i+1];
        }
        temp[temp.length -1] = number;
        numbers = temp;
    }

    }


    public void dequeueFront(){
        if (numbers == null)
        { System.err.println("empty deque");
            return;
        }else if (numbers.length==1){
            numbers= null;
            return;
        }
        int[] temp = new int [numbers.length-1];
        for (int i=0; i< temp.length; i++)
        {
            temp[i] = numbers[i];
        }
        numbers = temp;

    }









}
