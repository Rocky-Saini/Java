package javaApp;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int n) {
   if(n<=1) {
		return false;
   }
   for(int i=2;i<Math.sqrt(n);i++) {
	   if(n%2==0) {
		   return false;
	   }
   }
   return true;
	}
       public static void main(String args[])
       {
    	   try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter nmber : ");
			   int n=sc.nextInt();
			   
			   if(isPrime(n))
			   {
				   System.out.println(n + " is a prime number.");
			   }else {
				   System.out.println(n + " is not prime number.");
			   }
		}
    	   
       }

	
}
