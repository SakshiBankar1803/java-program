import java.util.*;
abstract class shape
{
   abstract void area();
   abstract void volume();
}

class sphere extends shape
{
   float r;
  sphere(float r)
  {
    this.r=r;
  }
  void area()
 {
   System.out.println("area of sphere="+(float)(4*3.14f*r*r));
 }
 void volume()
 {
   float v=1.3f*3.14f*r*r*r;
   System.out.println("volume of sphere="+v);
 }
}

class cone extends shape
{
   float r,h;
  cone(float r,float h)
  {
    this.r=r;
    this.h=h;
  }
  void area()
 {
   float a=(3.14f*r)*(r+h);
   System.out.println("area of cone="+a);
 }
 void volume()
 {
   float v=0.3f*3.14f*r*r*h;
   System.out.println("volume of cone="+v);
 }
}

class demo
{
  public static void main(String abc[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter radius::");
   float r=sc.nextFloat();
   sphere ob1=new sphere(r);
   ob1.area();
   ob1.volume();

  System.out.println("enter radius and height::");
   r=sc.nextFloat();
  float h=sc.nextFloat();
  cone ob2=new cone(r,h);
   ob2.area();
   ob2.volume();
 }
}
