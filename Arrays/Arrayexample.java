import java.util.Scanner;

// class Arrayexample{
//     public static void main(String args[]){
//     int arr[]={10,20,30,40};
//       for(int i=0;i<arr.length;i++){          // arr.length - Gives total size of array.
//         System.out.println(arr[i]);
//       }

//     }
// }

class Arrayexample{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int n=input.nextInt();

        int arr[] = new int[n];  // Create the array with the size 'n' BEFORE the loop

       for(int i=0;i<n;i++){          
          System.out.println("Enter array:- ");
          arr[i]=input.nextInt();  // Assign input to a specific index
        } 
         System.out.println("Array is:- ");  
          for(int i=0;i<arr.length;i++){     
            System.out.println(arr[i]);
           }
 
    }
}