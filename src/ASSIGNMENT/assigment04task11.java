package ASSIGNMENT;
/*Task11) Telling words: Draw flowchart and write javacode of a 
program that takes a number between 0 and 9. You have to 
print that number in words.
Hint: if n == 1, then print "one"
else if n == 2, then print "two"*/
import java.util.Scanner;
public class assigment04task11
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int n=abir.nextInt();
    if(n==0)
    {
      System.out.println("zero");
    }
    else
    {
      if(n==1)
    {
      System.out.println("one");
    }
    else
    {
      if(n==2)
      {
        System.out.println("two");
      }
      else
      {
        if(n==3)
        {
          System.out.println("three");
        }
        else
        {
          if(n==4)
          {
            System.out.println("four");
          }
          else
          {
            if(n==5)
            {
              System.out.println("five");
            }
            else
            {
              if(n==6)
              {
                System.out.println("Six");
              }
              else
              {
                if(n==7)
                {
                  System.out.println("seven");
                }
                else
                {
                  if(n==8)
                  {
                    System.out.println("eight");
                  }
                  else
                  {
                    if(n==9)
                    {
                      System.out.println("nine");
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
  }
}

