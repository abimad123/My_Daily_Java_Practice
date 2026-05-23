import java.util.Scanner;
class loops{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
          System.out.println("Enter the times to run the loop:- ");
          int n=input.nextInt();
            for(int i=0;i<=n;i++){
                System.out.println("The loop:- "+ i);
            }
           
    }
}