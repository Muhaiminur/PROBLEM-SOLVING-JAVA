package LAB12;
/*Problem 2) Kaprekar Number
Source: http://mathworld.wolfram.com/KaprekarNumber.html

Consider an  -digit number  . Square it and add the right  digits to the left  or  digits. If the resultant sum is  , then  is called a Kaprekar number. For example, 9 is a Kaprekar number since 

  

and 297 is a Kaprekar number since 
  

The first few are 1, 9, 45, 55, 99, 297, 703, ... 

Determine if a given number is Kaprekar Number
*/
import java.util.Scanner;
public class KAPREKAR_NUMBER{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int match=x;
    int main=x*x;
    String[]ar=new String[50];
    int ac=0;
    int x1=main;
    x=main;
      int count=0;
      while(x>0){
        x=x/10;
        count=count+1;
      }
      //System.out.println("your digits are ="+count);
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
     // System.out.print(a+" ");
      ar[ac]=Integer.toString(a);
      ac++;
      x1=x1%product;
      product=product/10;
    }
    System.out.println();
    int sum=0;
    if(ac==2){
       int first=Integer.parseInt(ar[0]);
       int second=Integer.parseInt(ar[1]);
       sum=first+second;
    }
    if(ac==3){
       int first=Integer.parseInt(ar[0]);
       int second=Integer.parseInt(ar[1]+ar[2]);
       sum=first+second;
    }
    if(ac==4){
       int first=Integer.parseInt(ar[0]+ar[1]);
       int second=Integer.parseInt(ar[2]+ar[3]);
       sum=first+second;
    }
    if(ac==5){
       int first=Integer.parseInt(ar[0]+ar[1]);
       int second=Integer.parseInt(ar[2]+ar[3]+ar[4]);
       sum=first+second;
    }
    if(ac==6){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]);
       int second=Integer.parseInt(ar[3]+ar[4]+ar[5]);
       sum=first+second;
    }
    if(ac==7){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]);
       int second=Integer.parseInt(ar[3]+ar[4]+ar[5]+ar[6]);
       sum=first+second;
    }
    if(ac==8){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]);
       int second=Integer.parseInt(ar[4]+ar[5]+ar[6]+ar[7]);
       sum=first+second;
    }
    if(ac==9){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]);
       int second=Integer.parseInt(ar[4]+ar[5]+ar[6]+ar[7]+ar[8]);
       sum=first+second;
    }
    if(ac==10){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]);
       int second=Integer.parseInt(ar[5]+ar[6]+ar[7]+ar[8]+ar[9]);
       sum=first+second;
    }
    if(ac==11){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]);
       int second=Integer.parseInt(ar[5]+ar[6]+ar[7]+ar[8]+ar[9]+ar[10]);
       sum=first+second;
    }
    if(ac==12){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5]);
       int second=Integer.parseInt(ar[6]+ar[7]+ar[8]+ar[9]+ar[10]+ar[11]);
       sum=first+second;
    }
    if(ac==13){
       int first=Integer.parseInt(ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5]);
       int second=Integer.parseInt(ar[6]+ar[7]+ar[8]+ar[9]+ar[10]+ar[11]+ar[12]);
       sum=first+second;
    }
    if(sum==match){
      System.out.println(sum +"  is a Kaprekar Number");
    }else{
      System.out.println(sum +"  is not a Kaprekar Number");
    }
  }
}