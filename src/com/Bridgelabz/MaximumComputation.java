package com.Bridgelabz;

public class MaximumComputation<T extends Comparable<T>> 
{
	T x,y,z;
  public MaximumComputation(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
  public T Maximum() {
 return  MaximumComputation.findMaximum(x,y,z);
  }
  public static<T extends Comparable<T>> T findMaximum(T x,T y,T z)
  {
	  T max;
		if(x.compareTo(y)>0 && x.compareTo(z)>0) {
			max=x;
		}
		else if(y.compareTo(x)>0 && y.compareTo(z)>0) {
			max=y;
		}
		else
		{
		max=z;
		}
		System.out.println("The MaximumNumber is : " +max);
		printMax(x,y,z,max);
		return max;
	}

   
public static String testMaximum(String x,String y ,String z) {
	  String max=x;
	  if(y.compareTo(max)>0) {
		  max=y;
	  }
	  if(z.compareTo(max)>0) {
		  max=z;
	  }
	  printMax(x,y,z,max);
      return max;
     }
  public static <T> void printMax(T x,T y, T z ,T max) {
	  System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);
  }
  public static void main(String [] args)
  {
	  System.out.println("Welcome to Maximum Compution of Three Numberd");
	  Integer x=20,y=12,z=25;
	  Float x1=12f,y1=20f,z1=26f;
	  String x2="Apple",y2="Banana",z2="peach";
	  MaximumComputation.testMaximum(x2, y2, z2);
	  new  MaximumComputation(x,y,z).findMaximum(x, y, z);
	  new  MaximumComputation(x1,y1,z1).findMaximum(x1,y1,z1);
	  new  MaximumComputation(x2,y2,z2).findMaximum(x2,y2,z2);
	
  }
}