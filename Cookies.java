package com.techouts.shoppingCart;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Cookies {

	int count=50,demo=0;
	Map<Integer,Integer> map=new LinkedHashMap<>();
	Cookies()
	{
		for(int i=1;i<=10;i++)
		{
			map.put(i, toString(count));
		}
	}
	public int toString(int count) {
		return count;
	}
	
	int display()
	{
		if(map.size()==0) {
			System.out.println("Total cookies:"+map.size());
			System.out.println("Sorry there are no cookies to buy");
			return 0;

		}
		else {
		System.out.println("...........COOKIES-Rs.50/-...........");
		System.out.println("Total cookies:"+map.size());
		return 1;

	}}
	int calcul(Integer num)
	{
		if(num<=map.size()) {
		System.out.print("\nCost for "+num+" cookies is: ");
		
			Set set=map.entrySet();
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        Map.Entry<Integer,Integer> entry=(Map.Entry<Integer,Integer>)itr.next();  
				num=(num*(entry.getValue()));
				System.out.print(num+"\n");
				break;	}
		    return num;}
		    else
			{
				System.out.println("Please enter the quantity based on the availability");
			}
			return 0;
	}
	void remove(int num)
	{
		if(num<=map.size()) {
			demo=demo+num;


		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) 
		{	
		    Entry<Integer,Integer> item = (Entry) it.next();
		    if(item.getKey()<=demo) {
		    it.remove();}
	}
}}

}
