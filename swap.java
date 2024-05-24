//reverse number

class reverse
{
  public static void main(String abc[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number::");
    int n=sc.nextInt();
    while(n>0)
    {
      int d=n%10;
      r=(r*10)%d;
      n=n/10;
    }
    System.out.println("reverse number="+r);
  }
}

