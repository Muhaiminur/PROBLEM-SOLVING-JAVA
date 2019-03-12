package LAB07;
/*Task 1

Write a java program that would input three numbers from the user and print sum, 
then the first number, then the 2nd number followed by 3rd number. 
If user enters 10, 20, 30. Then output should be 60, 10, 20, and 30.
*/
import java.util.Scanner;
public class CSE110Lab7task1{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("number ta");
    int num1=abir.nextInt();
    System.out.println("number ta");
    int num2=abir.nextInt();
    System.out.println("number ta");
    int num3=abir.nextInt();
    int sum=num1+num2+num3;
    System.out.println(sum);
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
  }
}