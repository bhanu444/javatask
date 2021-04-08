class Employee
{
private int id;
private string name;
Employee(int id.string name)
   {
    this.id=id;
    this.name=name;
    }
public void display()
{
 System.out.println("Employee Id:"+id);
 System.out.println("Name:"+name);
  }
}
class Edemo4
  {
   public static void main(String a[])
     {
   Employee e1=new Employee(1,"Bablu");
   Employee e2=new Employee(2,"Abhinay");
   e1.display();e2.display();
}