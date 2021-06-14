import java.util.Scanner;
class Armstrong_Number
{
public static void main(String args[])
{
  Scanner s = new Scanner(System.in);
  System.out.println("enter a number");
  int n = s.nextInt();
  int temp = n;
  int count =0;
  int sum = 0;
  
  while(n!=0)
 { 
  int rem = n%10;
    count++;
    n = n/10;
 }
 n =temp;
 while(n!=0)
 {
  int a = n%10;
  sum = sum + (int)Math.pow(a,count);
  n = n/10;
 }
 if(temp == sum)
System.out.println("Armstrong number");
else
System.out.println("Not Armstrong number");
}
}