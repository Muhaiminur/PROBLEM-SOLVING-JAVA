package LAB11;
/*2. Write a Java program that will ask the user to enter 10 numbers and will verify the users input after each entry. For example if the user enters 2,
 * the program will print �You have entered 2�, then if the user enters 4 the program will print �You have entered 2,  4�,
 * then if the user enters 23 the program will print �You have entered 2,  4 , 23�. This will go on till the user enters the 10 numbers.*/
import java.util.Scanner;
public class cse111Lab03task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int []a=new int[10];
    int c=0;
    while(c<a.length){
      a[c]=abir.nextInt();
      int d=0;
      System.out.print("You have entered ");
      while(d<=c){
        System.out.print(a[d]+" ");
        d++;
      }
      System.out.println();
      c++;
    }
  }
}