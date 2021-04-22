package com.collection.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter number of Students");
		int studentCount=sc.nextInt();
		for(int i=0;i<studentCount;i++) {
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			al.add(marks);
		}
		Collections.sort(al);
		System.out.println("Highest Marks is:"+al.get(al.size()-1));
		double total=0;
		double avg=0.0;
		for(int i=0;i<al.size();i++) {
			int num=(int)al.get(i);
			total=total+num;
			avg=total/studentCount;
		}
		System.out.println("Average is:"+avg);
		System.out.println("third student marks is:"+al.get(2));
		System.out.println("Stored:");
		for(int i=0;i<studentCount;i++) {
			System.out.println((i+1)+"-"+al.get(i)+"");
		}
	
	
		
		
			}
}


