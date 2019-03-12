package LAB03;
/*Task 7:
Draw the flowchart of a program that reads a student�s mark for a single subject, and prints out �Pass� if the student got more than 50, and �You shall not pass� otherwise.*/
import java.util.Scanner;
public class Lab03Task07flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter your Score");
    int x=abir.nextInt();
    if(x>=50){
      System.out.println("Pass");
    }else{
      System.out.println("You shall not pass");
    }
  }
}