package LAB12;
/*Problem 4) Narcissistic Number
http://mathworld.wolfram.com/NarcissisticNumber.html
Check if a number is Narcissistic Number or not.
An  -digit number that is the sum of the  th powers of its digits is called an  -narcissistic number. 
It is also sometimes known as an Armstrong number, perfect digital invariant (Madachy 1979), or plus perfect number. Hardy (1993) wrote,
"There are just four numbers, after unity, which are the sums of the cubes of their digits: 
 ,  ,  , and  . These are odd facts, very suitable for puzzle columns and likely to amuse amateurs,
 but there is nothing in them which appeals to the mathematician." Narcissistic numbers therefore generalize these 
 "unappealing" numbers to other powers (Madachy 1979, p. 164). 
The smallest example of a narcissistic number other than the trivial 1-digit numbers is 
(1) 

The first few are given by 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, ... (Sloane's A005188). 
 
base-10  -narcissistic numbers 
1 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
3 153, 370, 371, 407
4 1634, 8208, 9474
5 54748, 92727, 93084
6 548834
7 1741725, 4210818, 9800817, 9926315
8 24678050, 24678051, 88593477
*/
import java.util.Scanner;
public class NARCISSISTIC_NUMBER{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int main=x;
    int x1=x;
    int sum=0;
    int count=0;
    while(x>0){
      x=x/10;
      count=count+1;
    }
    //System.out.println(count);
    int count1=count;
    int product=1;
    int d=0;
    while(d<count-1){
      product=product*10;
      d++;
    }
    //System.out.println(product);
    int a=0;
    while(x1>0){
      a=x1/product;
      //System.out.print(a+" ");
      sum=sum+(int)Math.pow(a,count1);
      x1=x1%product;
      product=product/10;
    }
    if(sum==main){
      System.out.println(sum+" is a Narcissistic Number");
    }else{
      System.out.println(sum+" is not a Narcissistic Number");
    }
  }
}