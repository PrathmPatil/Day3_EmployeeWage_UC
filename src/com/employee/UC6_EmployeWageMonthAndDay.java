package com.employee;

import java.util.Random;

public class UC6_EmployeWageMonthAndDay {
	static int hr=0;
	static int day=0;
	
	static void presenti(int a)
	{	
		if(a==1)
			hr+=8;
		    day+=1;
		   
	}
	
	public static void main(String[] args) {

		/*
		 * for random value in java
		 * create Random class object;
		 * take int as a upperlimit; //int limit=3;(0 to 2)
		 * take int random value;
		 */
Random value=new Random();
int upperbond=2;
int value_random;
   for(int i=0;i<31;i++)
   {
	    value_random= value.nextInt(upperbond);
	   presenti(value_random);
   }
   /*
    * check hourse and day condtion wll be satsfy or not
    */
   if(hr>=100 && day>=20)
   {
   System.out.println("Total present day "+hr/8);
   System.out.println("Total absent day "+(31-(hr/8)));
   System.out.println("Total working hourse "+hr);
   System.out.println("Total Wage of the month is "+ (hr)*20);
   }
   else
   {
	   System.out.println("In this month day and hourse are not satisfed condition");
   }


	}

}
