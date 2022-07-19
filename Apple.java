package com.techouts.shoppingCart;
import java.util.*;
import java.util.Map.Entry;

public class Apple {

	int count=25,demo=0;
	Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
	Apple()
	{
		for(int i=1;i<=15;i++)
		{
			map.put(i, toString(count));
			
		}
	}
	public int toString(int count) {
		return count;
	}

	int display()
	{
		if(map.size()==0)
		{
			System.out.println("Total apples:"+map.size());
			System.out.println("Sorry, there are no apples");
			return 0;
		}
		else {
		System.out.println("...........APPLE-Rs.25/-...........");
		System.out.println("Total apples:"+map.size());
		System.out.println(map);
		return 1;
       }
	}

	int calcul(Integer num)
	{
		if(num<=map.size())  {
			System.out.print("\nCost for "+num+" apples is: ");

			Set set=map.entrySet();
			Iterator itr=set.iterator();  
			while(itr.hasNext()){  
				Map.Entry<Integer,Integer> entry=(Map.Entry<Integer,Integer>)itr.next();
				if(entry.getKey()==num) {
				num=(entry.getKey()*(entry.getValue()));
				System.out.print(num);
					}}
			System.out.println();

			return num;}
		else
		{
			System.out.println("Please enter the quantity based on the availability");
		}
		return 0;
		
	}
	void remove(int num) 
	{
		if(num<=map.size()) 
		{
			demo=demo+num;
			Iterator it = map.entrySet().iterator();
			while (it.hasNext()) 
			{	
				Entry<Integer,Integer> item = (Entry) it.next();
				if(item.getKey()<=demo) {
			     it.remove();
				}
				
			}
		}
		
		
		
		
		
	}

}