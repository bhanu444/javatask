/**
*Java Program to count valid Numbers
*num=1234=>count=4
*/
class Count
{
public static void main(String a[])
{
try{
   int count=0,num=1234;
   while(num!=0){
   //num=num/10
   num /=10;
   ++count;
}
  }
System.out.println("Number of digits:"+count);
 }
}

