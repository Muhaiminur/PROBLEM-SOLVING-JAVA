package LAB05;
/*Task 8:
Write a java program that prints the first hundred even  positive integers.*/
import java.util.Scanner;
public class Lab05task8setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    while(c<200){
      if(num%2==0){
        System.out.println(num);
      }
      c++;
      num++;
    }
  }
}