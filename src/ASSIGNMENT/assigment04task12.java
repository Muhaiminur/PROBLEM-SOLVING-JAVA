package ASSIGNMENT;
/*Task12) Combine Task 10 and 11 into a single flowchart and java 
program so that it can tell any number in words. 
Example: If user gives 932, print nine three two.*/
import java.util.Scanner;
public class assigment04task12
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int x1=x;
    int count=0;
    while(x>0)
    {
      x=x/10;
      count=count+1;
    }
    System.out.println("your digits are ="+count);
    int product=1;
    int d=0;
    while(d<count-1)
    {
      product=product*10;
      d++;
    }
    System.out.println(product);
    int a=0;
    while(x1>0)
    {
      a=x1/product;
      System.out.print(a+" ");
      if(a==0)
    {
      System.out.print("zero");
    }
    else
    {
      if(a==1)
    {
      System.out.print("one");
    }
    else
    {
      if(a==2)
      {
        System.out.print("two");
      }
      else
      {
        if(a==3)
        {
          System.out.print("three");
        }
        else
        {
          if(a==4)
          {
            System.out.print("four");
          }
          else
          {
            if(a==5)
            {
              System.out.print("five");
            }
            else
            {
              if(a==6)
              {
                System.out.print("Six");
              }
              else
              {
                if(a==7)
                {
                  System.out.print("seven");
                }
                else
                {
                  if(a==8)
                  {
                    System.out.print("eight");
                  }
                  else
                  {
                    if(a==9)
                    {
                      System.out.print("nine");
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    }
      x1=x1%product;
      product=product/10;
    }
    System.out.println();
  }
}
