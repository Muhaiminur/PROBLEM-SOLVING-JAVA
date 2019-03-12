package LAB07;
/*Task 11
Write a program which reads 5 numbers into an array, sorts/arranges the numbers from high to low and prints all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print 13, 10, 7, 6, 2.
*/
import java.util.Scanner;
public class CSE110Lab7task11{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[5];
    int c=0;
    while(c<5){
      System.out.println("number?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<a.length){
      int max=a[d];
      int maxloc=d;
      int e=d+1;
      while(e<a.length){
        if(a[e]>max){
         max=a[e];
         maxloc=e;
        }
        e++;
      }
      int backup=a[d];
      a[d]=a[maxloc];
      a[maxloc]=backup;
      d++;
    }
    int f=0;
    while(f<a.length){
      System.out.print(a[f]+",");
      f++;
    }
    System.out.println();
  }
}