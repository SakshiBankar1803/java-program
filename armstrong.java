//armstrong number

import java.util.*;

class armstrong
{
  public static void main(String abc[])
  {
    int n1,d,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no::");
    int n=sc.nextInt();
    n1=n;
    while(n!=0)
    {
      d=n%10;
      n=n/10;
      s=s+d*d*d;
    }
    if(s==n1)
    System.out.println("armstrong number");
    else
   System.out.println(" not armstrong number");
  }
}