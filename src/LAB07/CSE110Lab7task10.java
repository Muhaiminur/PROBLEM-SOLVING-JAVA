package LAB07;
/*Task 10
Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print 2, 6, 7, 10, and 13.
*/
import java.util.Scanner;
public class CSE110Lab7task10{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[5];
    int c=0;
    while(c<5){
      System.out.println("number ta vai?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<a.length){
      int min=a[d];
      int minloc=d;
      int e=d+1;
      while(e<a.length){
        if(a[e]<min){
          min=a[e];
          minloc=e;
        }
        e++;
      }
      int backup=a[d];
      a[d]=a[minloc];
      a[minloc]=backup;
      d++;
    }
    int f=0;
    while(f<a.length){
      System.out.println(a[f]);
      f++;
    }
  }
}