package com.employee;

import java.util.Random;

public class UC4_EmployeWageSwitchCase {
	static int hr=0;
	static int pt=0;
	
	static void presenti(int a,int b)
	{	
		switch (a)
		{
		case 1: hr+=8;
		break;
		}
		
		switch(b)
		{
		case 1 :pt+=8;
		break;
		}
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
int value_randompart;
   for(int i=0;i<=31;i++){
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
