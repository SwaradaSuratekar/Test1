package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collection {

	public static void main(String[] args) 
	{
		Collection c=new Collection();
		c.set();
		list();
	}
	
	public void set() 
	{
		Set<Integer> set= new HashSet<Integer>();
		for(int i=0;i<=5;i++) 
		{
			set.add(i);
		}
		System.out.println(set);
		int j=3;
		if(set.contains(j))
		{
			set.remove(j);
		}
		System.out.println(set);
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void list() 
	{
		List<Integer> list = new ArrayList();
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				list.add(i);
			}
		}
		System.out.println(list);
		System.out.println("Size of list: "+list.size());
		ListIterator<Integer> l_itr= list.listIterator();
		for(int j=list.size()-1; j>0;j--) {
			System.out.println(l_itr.next());
		}
	}
	
}
