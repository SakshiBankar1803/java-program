//convert temp celcius to farheheit

import java.util.*;
class convert
{
  static public void main(String abc[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter temp in celcius::");
    int c=sc.nextInt();
    float ans=(c*1.8f)+32;
    System.out.println("temp in fahrenheit="+ans);
  }
}
