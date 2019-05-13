	import java.util.*;
	class Bingbang
	{
	  public static void main(String args[])
		{
		   Scanner sc =new Scanner(System.in);
                   int a;
                    System.out.println("Enter any number");
                     a=sc.nextInt();
                    if(a%3==0 && a%5!=0)
		     {
                       
                        System.out.println("bing");
                     }
		     if(a%5==0 && a%3!=0)
                      {
                         System.out.println("bang");
                      }
      		      if (a%3==0 && a%5==0)
                      { 
                        System.out.println("bingbang");
                        
	}	 
      }
}