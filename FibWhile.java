import java.util.Scanner;
public class FibWhile{
public static void main(String[] args)
{
 int n,first=0,next=1;
System.out.println("Enter how may fibonacci numbers to print");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
System.out.print("The first"+n+"Fibonacci numbers are:");
System.out.print(first+""+next);
int i=1;
while(i<n-1)
{
 int sum=first+next;
first=next;
next=sum;
System.out.print(""+sum);
i++;
   }
  }
}