package LAB07;
/*Task 8
Write a program which reads 5 numbers into an array and prints the largest number and its location in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print �largest number 13 was found at location 1�.
*/
import java.util.Scanner;
public class CSE110Lab7task8{
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
    int maxloc=0;
    int d=0;
    while(d<5){
      if(a[d]>max){
        max=a[d];
        maxloc=d;
      }
      d++;
    }
    System.out.println("largest number "+max+" was found at location"+maxloc);
  }
}