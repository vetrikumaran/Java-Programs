import java.util.*;
class Denominations
{
public static void main(String args[])
{
 Scanner sc =new Scanner(System.in);
int amount;
System.out.println("Enter Amount");
amount=sc.nextInt();
if(amount%100==0)
{
int note1=2000, note2=500, note3=200, note4=100, m,n,l,o,p,q,r;
System.out.println("Denominations");
m=amount/note1;
System.out.println("Rupees 2000="+m);
n=amount%note1;
l=n/note2;
o=n%note2;
System.out.println("Rupees 500="+l);
p=o/note3;
q=o%note3;
System.out.println("Rupees 200="+p);
r=q/note4;
System.out.println("Rupees 100="+r);
}
else
{
System.out.println("Please Enter Valid amount");
}}}





