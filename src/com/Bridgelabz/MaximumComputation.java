package com.Bridgelabz;

public class MaximumComputation 
{
  public static void main(String [] args)
  {
	  System.out.println("Welcome to Maximum Compution of Three Numberd");
	  Float x=12.4f,y=12.7f,z=12.8f;
	  findMaximum(x,y,z);
  }

private static void findMaximum(Float x, Float y, Float z) {
	Float maxNumber;
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