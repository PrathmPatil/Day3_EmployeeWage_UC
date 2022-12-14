package com.employee;

import java.util.Random;

public class EmployeTotalWage {

	static int  hr=0;
	static int pt=0;
	/*
	 * using method show employe present or not
	 * 
	 */
	static void presenti(int a,int b)
	{
		
		if(a==1)
		{
		  hr+=8;	
		}	
		if(b==1)
		{
			pt+=8;
		}
				
	}
	public static void main(String []args)
	{
		/*
		 * for random value in java
		 * create Random class object;
		 * take int as a upperlimit; //int limit=3;(0 to 2)
		 * take int random value;
		 */
Random value=new Random();
int upperbond=2;
int value_random;
int value_randompart;
   for(int i=0;i<=31;i++) 
   {
	    value_random= value.nextInt(upperbond);
	   //presenti(value_random);
	   value_randompart= value.nextInt(upperbond);
	   presenti(value_random,value_randompart);

   }
   System.out.println("Total present day "+hr/8);
   System.out.println("Total absent day "+(31-(hr/8)));
   System.out.println("Total part time hours "+pt);
   System.out.println("Total Wage of the month is "+ (pt+hr)*20);

	}
}
