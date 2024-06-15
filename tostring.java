import java.util.*;
class emp
{
  int eno;String ename;float sal;
 void accept()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter emp no name and sal::");
  eno=sc.nextInt();
  ename=sc.next();
  sal=sc.nextFloat();
}
public String toString()
{
  return"\nemp no="+eno+"\nemp name="+ename+"\n emp salary="+sal;
}
}

class demo
{
  public static void main(String abc[])
 {
   emp ob=new emp();
   ob.accept();
   System.out.println(ob);
 }
}