import java.util.Scanner;
class EvenOddif{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter an number for check Even or Odd: ");
          int a = input.nextInt();
           if(a%2==0){
            System.out.println("The number " + a + " is Even ");
           }else{
            System.out.println("The number " + a + " is Odd ");
           }
    }
}

//in else should not have the conditions