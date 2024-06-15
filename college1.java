import java.util.*;
class college
{
    int cno;
    String cname,adder;
    Scanner sc=new Scanner(System.in);
    void acceptc()
    {
        System.out.println("enter collge no::");
        cno=sc.nextInt();
        System.out.println("enter collge name::");
        cname=sc.next();
        System.out.println("enter collge adderess::");
        adder=sc.nextLine();
    }
}

class student extends college
{
    int rno,cno;
    String sname,cname,adder;
    float per;
    Scanner sc=new Scanner(System.in);
    void accepts()
    {
        System.out.println("enter stud roll no::");
        rno=sc.nextInt();
        System.out.println("enter student name::");
        sname=sc.next();
        System.out.println("enter stud per::");
        per=sc.nextFloat();
    }
    void disps()
    {
        

        System.out.println("college no="+cno);
        System.out.println("college name="+cname);
        System.out.println("college adderess="+adder);
        System.out.println("student roll no="+rno);
        System.out.println("student name="+sname);
        System.out.println("student per="+per);
    }
}

class teacher
{
    int tid,cno;
    String tname,cname,adder;
    float sal;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter teacher id::");
        tid=sc.nextInt();
        System.out.println("enter teacher name::");
        tname=sc.next();
        System.out.println("enter salary::");
        sal=sc.nextFloat();
    }
    void disp()
    {
         System.out.println("college no="+cno);
        System.out.println("college name="+cname);
        System.out.println("college adderess="+adder);
        System.out.println("teacher id="+tid);
        System.out.println("teacher name="+tname);
        System.out.println("teacher sal="+sal);
    }
}

class demo
{
    public static void main(String abc[])
    {
       student ob=new student();
       ob.acceptc();
       ob.accepts();
       ob.disps();

       /*teacher ob1=new teacher();
       ob1.acceptc();
       ob1.accept();
       ob1.disp();*/


    }
}