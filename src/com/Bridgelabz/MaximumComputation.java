package com.Bridgelabz;

public class MaximumComputation 
{
  public static void main(String [] args)
  {
	  System.out.println("Welcome to Maximum Compution of Three Numberd");
	  Integer x=20,y=12,z=25;
	  Float x1=12.4f,y1=12.7f,z1=12.8f;
	  String x2="Apple",y2="Banana",z2="peach";
	  findMaximum(x,y,z);
	  findMaximum(x1,y1,z1);
	  findMaximum(x2,y2,z2);
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
  private static void findMaximum(Float x1, Float y1, Float z1) {
		Float maxNumber;
		if(x1.compareTo(y1)>0 && x1.compareTo(z1)>0) {
			maxNumber=x1;
		}
		else if(y1.compareTo(x1)>0 && y1.compareTo(z1)>0) {
			maxNumber=y1;
		}
		else
		{
		maxNumber=z1;
		}
		System.out.println("The MaximumNumber is : " +maxNumber);
	}

private static void findMaximum(String x2, String y2, String z2) {
	String maxNumber;
	if(x2.compareTo(y2)>0 && x2.compareTo(z2)>0) {
		maxNumber=x2;
	}
	else if(y2.compareTo(x2)>0 && y2.compareTo(z2)>0) {
		maxNumber=y2;
	}
	else
	{
	maxNumber=z2;
	}
	System.out.println("The MaximumString is : " +maxNumber);
}
}