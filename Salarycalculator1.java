import java.util.*; 
import java.io.*; 
import java.util.Scanner;
class Salarycalculator1{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	int WorkingHours,Basicpay,Miniumhour=40,OverTime,Allowance,Salary,FinalSalary;
	System.out.println("Working Hours");
	WorkingHours=sc.nextInt();
	System.out.println("Basic pay");
	Basicpay=sc.nextInt();
if((WorkingHours>=40&&WorkingHours<=60)&&Basicpay>=50)
	{
	OverTime=WorkingHours-Miniumhour;
	Allowance=OverTime*(Basicpay*150/100);
	Salary=Miniumhour*Basicpay;
	FinalSalary=Allowance+Salary;
	System.out.println("Final Salary="+FinalSalary);
	}else
		{
		System.out.println("Enter Valid Number");
		}				
}}
