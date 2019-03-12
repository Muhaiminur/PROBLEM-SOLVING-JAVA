package LAB07;
/*Task 7
Write a program which reads 5 numbers into an array and prints the largest number. 
If the user enters 7, 13, 2, 10, 6 then your program should print 13.
*/
import java.util.Scanner;
public class CSE110Lab7task7{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[5];
    int c=0;
    while(c<5){
      System.out.println("number?");
      a[c]=abir.nextInt();
      c++;
    }
    int max=a[0];
    int d=0;
    while(d<5){
      if(a[d]>max){
        max=a[d];
      }
      d++;
    }
    System.out.println(max);
  }
}