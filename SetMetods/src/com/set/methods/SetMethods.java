package com.set.methods;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;

public class SetMethods{
	public static void main(String[] args) {
     	HashSet<String> nameSet = new HashSet<>();
		nameSet.add("Ram");
		nameSet.add("Rama");
		nameSet.add("Mohan");
		nameSet.add("Ram");
		nameSet.add("Peter");
		System.out.println(nameSet);

		
    	Set<String> friendSet = new TreeSet<>();
		friendSet.add("Ram");
		friendSet.add("Rama");
		friendSet.add("Mohan");
		friendSet.add("Ram");
		friendSet.add("Peter");
		System.out.println(friendSet);
		TreeSet<String> friendSet1=new TreeSet();
		friendSet1.add("Vani");
		friendSet1.add("nitya");
		System.out.println(friendSet1);
		
		friendSet.remove("Ram");
		System.out.println(friendSet);
		
		friendSet1.removeAll(friendSet1);
		System.out.println(friendSet1);
		
		System.out.println(friendSet.contains("Ram"));
		
		Iterator<String> iterator= friendSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			for(Object obj:friendSet) {
				String name=(String) obj;
				System.out.println(name.toUpperCase());
			}
		}
	
		
		
	}
}
		
		


