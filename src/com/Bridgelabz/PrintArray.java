package com.Bridgelabz;

public class PrintArray 
{
	 public static void main(String[] args) {
		 Integer[] a= {1,2,3,4,5};
		  Double[] b= {1.1, 2.2, 3.3,4.4, 5.5};
		  Character[] c={'A','B','C','d'};
		  toPrint(a);
		  toPrint(b);
		  toPrint(c);
	  }
	  
private static <E> void toPrint(E[] a) {
	for(E i:a) {
		System.out.println(i);
	}
		
	}


}
