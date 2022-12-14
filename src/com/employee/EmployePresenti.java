package com.employee;
import java.util.Random;
//import java.util.Random.*;
public class EmployePresenti {
	/*
	 * using method show employe present or not
	 * 
	 */
	static void presenti(int a)
	{
		if(a==1)
			System.out.println("Present");
		else
			System.out.println("Absent");
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
int value_random= value.nextInt(upperbond);
presenti(value_random);

	}

}
