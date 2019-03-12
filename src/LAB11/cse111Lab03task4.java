package LAB11;
/*4. Write a Java program that would ask the user to enter five numbers. As the user enters the five numbers the program will make
 * sure that all the numbers entered by the user are unique. For example if the user enters 2, 3, 4, 6, and then tries to enter 3 again 
 * the program will display that 3 is already in among the entered numbers and would ask the user to enter a new number.
 * You will have to keep taking numbers from the user until you receive five unique numbers. At the end, print those five unique numbers.*/
import java.util.Scanner;
public class cse111Lab03task4{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int []a=new int[10];
    int num=0;
    int c=0;
    while(c<a.length){
      num=abir.nextInt();
      int d=0;
      System.out.print("You have entered ");
      while(d<=c){
        if(num==a[d]){
          System.out.println(num+ "is already in among the entered numbers");
          num=abir.nextInt();
        }
        d++;
      }
      a[c]=num;
      c++;
    }
    int e=0;
    while(e<a.length){
      System.out.println(a[e]);
      e++;
    }
  }
}