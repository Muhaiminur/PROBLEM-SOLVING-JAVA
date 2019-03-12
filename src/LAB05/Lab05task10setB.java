package LAB05;
/*Task 10:
Write a Java program which adds all numbers that are multiples of both 7 and 9 up to 600.
*/
import java.util.Scanner;
public class Lab05task10setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    int sum=0;
    while(c<600){
      if(num%7==0){
        if(num%9==0){
          sum=sum+num;
        }
      }
      num=num+1;
      c=c+1;
    }
    System.out.println(sum);
  }
}