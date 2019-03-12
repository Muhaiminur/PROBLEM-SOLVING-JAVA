package LAB12;
/*Problem 1) Happy Number

Source: http://online-judge.uva.es/p/v105/10591.html

Let the sum of the square of the digits of a positive integer S0 be represented by S1. In a similar way, let the sum of the squares of the digits of S1 be represented by S2 and so on. If Si = 1 for some i ? 1, then the original integer S0 is said to be Happy number. A number, which is not happy, is called Unhappy number. For example 7 is a Happy number since 7 -> 49 -> 97 -> 130 -> 10 -> 1 and 4 is an Unhappy number since 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4.

Input
The input consists of several test cases, the number of which you are given in the first line of the input. Each test case consists of one line containing a single positive integer N smaller than 109.

Output
For each test case, you must print one of the following messages: 
Case #p: N is a Happy number.
Case #p: N is an Unhappy number. 

Here p stands for the case number (starting from 1). You should print the first message if the number N is a happy number. Otherwise, print the second line.

 Sample Input Output for Sample Input
3
7
4
13 Case #1: 7 is a Happy number.
Case #2: 4 is an Unhappy number.
Case #3: 13 is a Happy number.
E.g. Consider 19

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1 which means that 19 is a happy number.

- See more at: http://www.transum.org/software/SW/Starter_of_the_day/starter_January25.asp?ver=stu#sthash.lD9rzCSj.dpuf
*/
import java.util.Scanner;
public class HAPPYNUMBER{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int main=x;
    int x1=x;
    int sum=0;
    int s=0;
    while(s<5000){
    int count=0;
    while(x>0){
      x=x/10;
      count=count+1;
    }
    int product=1;
    int d=0;
    while(d<count-1){
      product=product*10;
      d++;
    }
    int  f=0;
    int a=0;
    while(x1>0){
      a=x1/product;
      f=a*a+f;
      x1=x1%product;
      product=product/10;
    }
    sum=f;
    if(sum==1)
    break;
    x1=sum;
    x=x1;
    s++;
  }
    if(sum==1){
      System.out.println(main+" is a Happy number");
    }else{
      System.out.println(main+" is not a happy number?");
    }
    }
}