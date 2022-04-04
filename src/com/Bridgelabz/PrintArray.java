package com.Bridgelabz;

public class PrintArray 
{
	 public static void main(String[] args) {
		  int[] a= {1,2,3,4,5};
		  double[] b= {1.1, 2.2, 3.3,4.4, 5.5};
		  char[] c={'A','B','C','d'};
		  toprint(a);
		  toPrint(b);
		  toPrint(c);
	  }
	  
private static void toPrint(char[] c) {
	  for(char i:c) {
			System.out.println(i);
		}
		
	}

private static void toPrint(double[] b) {
	  for(double i:b) {
			System.out.println(i);
		}
		
	}

private static void toprint(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
		}
}
