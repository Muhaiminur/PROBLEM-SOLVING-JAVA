package LAB07;
/*Task 4
Write a java program that reads 10 numbers from the user and prints the first even number in the list.
*/
import java.util.Scanner;
public class CSE110Lab7task4{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<10){
      System.out.println("number?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<10){
      if(a[d]%2==0){
        System.out.println(a[d]);
        break;
      }
      d++;
    }
  }
}