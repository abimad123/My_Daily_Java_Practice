import java.util.Scanner;
class Table{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the number its table:- ");
          int n=input.nextInt();
      for(int i=1;i<=10;i++){
        System.out.println(i+" X "+ n +" = "+(i*n));
      }
    }
}