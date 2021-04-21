package com.list.iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class lterator {

	public static void main(String[] args) {
	
	ArrayList friendsList=new ArrayList();
      friendsList.add("Ram");
	  friendsList.add("Shyam");
	  friendsList.add("pravalika");
      ListIterator li= friendsList.listIterator();
			while(li.hasNext()) {
				String name=(String) li.next();
				System.out.println(name.toUpperCase());
			}
			System.out.println("-------------------------------");
				while(li.hasPrevious()) {
					String name=(String) li.previous();
					System.out.println(name.toUpperCase());
				}
				
			}

			}


	


