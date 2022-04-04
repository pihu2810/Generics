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
  public static<E extends Comparable<E>>void findMaximum(E x,E y,E z)
  {
	  E maxNumber;
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