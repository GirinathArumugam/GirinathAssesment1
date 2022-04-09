package com.prodapt.assesment;

public class SimpleInterest {
	
   static double p =15000;//principle amount
   static double r=12;//rate
   static int t=2;//time
   static double si=(p*r*t)/100;
   double totalamount=p+si;

    public static void main (String[] args) {
    	double totalamount=p+si;
    	System.out.println("the simple interest is "+si);
    	System.out.println("the total amount is "+totalamount);
    	
    }
    }
