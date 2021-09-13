public class NewClass {  
    public static void main(String[] args) {   
       int[] arr = new int[10];
       // initialize the elements of the array
       for(int i=0; i< arr.length; i++){
            arr [i] = 10 + i;
       }
       // access their values
       for(int i=0; i< arr.length; i++){
           System.out.println("Arr["+i+"] : "+ arr [i]);
       }
    } 
}
