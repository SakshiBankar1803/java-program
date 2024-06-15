import java.util.*;
abstract class staff
{
  String name,add;
 Scanner sc=new Scanner(System.in);
 abstract void disp();
}

class fstaff extends staff
{
  String dept;
  float sal;
  fstaff(String name,String add,String dept,float sal)
 {
   this.name=name;
   this.add=add;
   this.dept=dept;
   this.sal=sal;
 }
 void disp()
 {
   System.out.println("staff name="+name);
   System.out.println("staff adderess="+add);
   System.out.println("staff department="+dept);
   System.out.println("staff salary="+sal);
 }
}

class pstaff extends staff
{
  int r,hr;
 
  pstaff(String name,String add,int hr,int r)
 {
   this.name=name;
   this.add=add;
   this.hr=hr;
   this.r=r;
 }
 void disp()
 {
   System.out.println("staff name="+name);
   System.out.println("staff adderess="+add);
   System.out.println("staff no of hrs="+hr);
   System.out.println("staff rate per hr="+r);
   System.out.println("staff sal="+(hr*r));
 }
}

class demo
{  
  public static void main(String abc[])
 {  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter limit::");
  int n=sc.nextInt();
  fstaff ob[]=new fstaff[n];
  pstaff ob1[]=new pstaff[n];
   int ch;
   do
  {
    System.out.println("1=full time staff\n2=part time staff\n enter your choice::");
     ch=sc.nextInt();
    switch(ch)
    {
      case 1 :for(int i=0;i<n;i++)
              {
                System.out.println("enter staff name::");
                String name=sc.next(); 
               System.out.println("enter staff adderss::");
                String add=sc.next(); 
               System.out.println("enter staff depart::");
                String dept=sc.next(); 
                System.out.println("enter staff sal::");
                int sal=sc.nextInt();
                ob[i]=new fstaff(name,add,dept,sal); 
              }
              
              for(int i=0;i<n;i++)
              {
                ob[i].disp();
               }
               break;
             
  case 2:for(int i=0;i<n;i++)
              {
                System.out.println("enter staff name::");
                String name=sc.next(); 
               System.out.println("enter staff adderss::");
                String add=sc.next(); 
               System.out.println("enter staff hours::");
                int hr=sc.nextInt(); 
                System.out.println("enter rate per hrs::");
                int r=sc.nextInt();
                ob1[i]=new pstaff(name,add,hr,r); 
              }
              
              for(int i=0;i<n;i++)
              {
                  ob1[i].disp();
               }
              break;
              
             
    }
  }while(ch<3);
 }
}




















