package LAB11;
/*1. Write a Java program that would input ten numbers from the user and print the ten numbers in reverse order.*/
import java.util.Scanner;
public class cse111Lab03task1{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int []a=new int[10];
    int c=0;
    while(c<a.length){
      a[c]=abir.nextInt();
      c++;
    }
    int d=9;
    while(d>=0){
      System.out.println(a[d]);
      d--;
    }
  }
}