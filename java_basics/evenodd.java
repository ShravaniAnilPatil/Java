package java.java_basics;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sc.close();
   if (num%2==0){
    System.out.println("even");

   }
   else{
    System.out.println("odd");
   }
    }
}
