import java.util.Scanner;
class ArithOperators{
    public static void main(String args[]){
     Scanner input = new Scanner(System.in);
      System.out.println("Enter Two number for all Arithmetic Operators: ");
       int a=input.nextInt();
       int b=input.nextInt();
           
          System.out.println("Here the outputs: ");  
           System.out.println(a+b);
           System.out.println(a-b);
           System.out.println(a*b);
           System.out.println(a%b);
           System.out.println(a/b);
    }
}

//% Operator - Used for: even/odd, palindrome, reverse number
