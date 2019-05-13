import java.util.*;
class Swaptwonumbers
{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int a,b,c;
System.out.println("Enter the Values");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swap\n\t"+a+"\n\t"+b);
c=a;
a=b;
b=c;
System.out.println("After Swap\n\t"+a+"\n\t"+b);
}}