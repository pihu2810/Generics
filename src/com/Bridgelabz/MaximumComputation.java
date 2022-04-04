package com.Bridgelabz;

public class MaximumComputation 
{
  public static void main(String [] args)
  {
	  System.out.println("Welcome to Maximum Compution of Three Numberd");
	  Integer x=20,y=12,z=25;
	  findMaximum(x,y,z);
  }

private static void findMaximum(Integer x, Integer y, Integer z) {
	Integer maxNumber;
	if(x.compareTo(y)>0 && x.compareTo(z)>0) {
		maxNumber=x;
	}
	else if(y.compareTo(x)>0 && y.compareTo(z)>0) {
		maxNumber=y;
	}
	else
	{
	maxNumber=z;
	}
	System.out.println("The MaximumNumber is : " +maxNumber);
}
}