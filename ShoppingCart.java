package com.techouts.shoppingCart;

import java.util.Scanner;

public class ShoppingCart {

	 static int appTot,chocTot,cookTot;
	public static void main(String[] args) {
		int num=0,times=0,apples=1,chocolates=1,cookies=1;
		String s="yes";
		 Apple a=new Apple();
		 Chocolate c=new Chocolate();
		 Cookies cake=new Cookies();
		Scanner sc=new Scanner(System.in);
	    while(true) {
		System.out.println("Enter the username:");
		String name=sc.next();
		if(apples==0 && chocolates==0 && cookies==0)
		{
			System.out.println("Sorry there is nothing to buy");
		}
		else {
		do {
		System.out.println("Enter the item you want to buy:\n1.Apple-Rs.25/- \t 2.Chocolate-Rs.10/-  \t 3.Cookies-Rs.50/-");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			apples=a.display();
			if(apples!=0) {
			System.out.println("Enter the number of Apples you want to buy:");
			num=sc.nextInt();	   
			appTot=a.calcul(num); 
			a.remove(num);}
			break;

		case 2:
			chocolates=c.display();
			if(chocolates!=0) {
			System.out.println("Enter the number of Chocolates you want to buy:");
			num=sc.nextInt();
			 chocTot=c.calcul(num);
			c.remove(num);}
			break;


		case 3:
			cookies=cake.display();
			if(cookies!=0) {
			System.out.println("Enter the number of Cookies you want to buy:");
			num=sc.nextInt();
			 cookTot=cake.calcul(num);
			cake.remove(num);}
			break;

		default:
			System.out.println("Please select the valid item");
				}
		
		System.out.println("Do yo want to continue, enter yes or no: ");
		s=sc.next();
		   
		if(s.equalsIgnoreCase("no"))
		   {
			   System.out.println("Name: "+name+"\nTotal Cost is: "+(appTot+chocTot+cookTot));
			   appTot=0;
			   chocTot=0;
			   cookTot=0;   
		   }
		}
		while(s.equalsIgnoreCase("yes"));
		times++;
	    }
	    }
	   
	    
	}
}
