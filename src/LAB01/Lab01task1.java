/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01;

/*Draw the flowchart of a program that reads one number from the user, and prints it back to show which number was entered by the user.*/
import java.util.Scanner;
public class Lab01task1{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num=abir.nextInt();
    System.out.println("apnar number ti= "+num);
  }
}