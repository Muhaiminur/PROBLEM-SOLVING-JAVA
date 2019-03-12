package LAB05;
/*
Task 7:
Write a java program that prints the first twenty positive integers.
*/
import java.util.Scanner;
public class Lab05task7setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    while(c<100){
      System.out.println(num);
      num=num+1;
      c=c+1;
    }
  }
}