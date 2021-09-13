public class NewClass {  
    public static void main(String[] args) {   
       int arr[][] = new int[3][5];
       // initialize the elements of the array
       for(int i=0; i< 3; i++){
           for(int j=0; j< 5; j++){
            arr [i][j] = 10 + i;
       }}
       // access their values 
       for(int i=0; i< 3; i++){
           for(int j=0; j< 5; j++){
           System.out.println("Arr["+i+", "+j+"] : "+ arr [i][j]);
       }
       }
    } 
}
