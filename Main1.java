class ArraysExample{
    void multiArrays(){
       // int [][] arr_1= new int [5][3];
        //or
        int [][] arr={{56,43,6},{34,7,8},{12,56,8}};
        System.out.println(arr[0][1]);
    }
    void demoArray(){
        int [] ages =new int [3];
        float[] weights =new float[3];
        String[] names = {"rahul","raj","aradhya"};

        ages[0]=34;
        ages[1]=45;
        ages[2]=32;
       // ages[4]=11;
      System.out.println(ages[0]);
      System.out.println(ages[1]);
      System.out.println(ages[2]);
      

      System.out.println(names[0]);
      System.out.println(names[1]);
      System.out.println(names[2]);



    }
}


public class Main1 {
    public static void main(String[] args) {
        ArraysExample obj =new ArraysExample();
        obj.multiArrays();


    }
    
}
