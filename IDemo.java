  interface Shape
{
 public abstract void display();
}
class Circle implements Shape
{
 public void display()
{
 System.out.println("Circle");
  }
}
class Rectangle implements Shape
 {
  public void display()
 {
  System.out.println("Rectangle");
   }
}
 class Square implements Shape
{
 public void display() 
{
 System.out.println("Square");
 }
} 
 class IDemo
 {
  public static void main(String a[])
  {
  Shape s1=new Circle();
  Shape s2=new Rectangle();
  Shape s3=new Square();
  s1.display();
  s2.display();
  s3.display();
   }
}