abstract class Shape
{
 int length,breadth,radius,side;
 scanner input=new scanner(System.in);
 abstract void printArea();
}
 class Circle extends shape
 
  void printArea()
  {
  System.out.println("\nfinding the area of circle");
  System.out.println("enter radius:");
  radius=input.nextint();
  System.out.println("The area of circle:"+3.14f*radius*radius);
}
}
class Square extends Shape
{
 void printArea()
{
 System.out.println("fining the area of square");
 System.out.println("enter side:");
 side=input.nextint();
System.out.println("The area of square:"+side*side);
}
class rectangle extends Shape
{
 void printArea()
 {
  System.out.println("finding the area of rectangle");
  System.out.println("enter length and breadth:");
  length=input.nextint();
  breadth=input.nextint();
  System.out.println("The area of rectangle is:"+length*breadth);
   }
  }
}