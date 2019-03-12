package LAB07;
/*Task 2
Write a java program that reads 10 numbers from the user. The program then reads a number between 0 to 9, 
and shows the number at the corresponding index number. 
For instance, if the array is a and the user enters 3, your program should print the value a[3]
*/
import java.util.Scanner;
public class CSE110Lab7task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<10){
      System.out.println("number?");
      a[c]=abir.nextInt();
      c++;
    }
    System.out.println("knta ver krbo?");
    int find=abir.nextInt();
    System.out.println(a[find]);
  }
}