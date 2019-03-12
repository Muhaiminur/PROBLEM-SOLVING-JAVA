package LAB12;
/*Problem 2) Kaprekar Number
Source: http://mathworld.wolfram.com/KaprekarNumber.html

Consider an  -digit number  . Square it and add the right  digits to the left  or  digits. If the resultant sum is  , then  is called a Kaprekar number. For example, 9 is a Kaprekar number since 

  

and 297 is a Kaprekar number since 
  

The first few are 1, 9, 45, 55, 99, 297, 703, ... 

Determine if a given number is Kaprekar Number
*/
import java.util.Scanner;
public class cse111Lab10task2a{
  public static void main(String [] args){
    Scanner abir=new Scanner(System.in);
    String input=abir.next();
    int num= Integer.parseInt(input);
    int sqrtNum= (int)Math.pow(num,2);
    String sNum= Integer.toString(sqrtNum);
    int k=(sNum.length()/2);
    String fstNum= "";
    String sndNum= "";
    for(int p=0;p<k;p++){
      fstNum=fstNum+Character.toString(sNum.charAt(p));
    }
    for(int p=k;p<sNum.length();p++){
      sndNum=sndNum+Character.toString(sNum.charAt(p));
    }
    int sum=Integer.parseInt(fstNum)+Integer.parseInt(sndNum);
    if(sum==num){
      System.out.println("the number is a Kaprekar Number");
    }else{
      System.out.println("the number is a not Kaprekar Number");
    }
  }
}