package com.full.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) throws IOException {
		HashSet<Hostel> set=new HashSet<Hostel>();  
		Scanner scan=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     
		Hostel h1=new Hostel("LaxmiRamana",2213,404,"yes","yes","yes","yes",4700);
	    set.add(h1);
	    Hostel h2=new Hostel("LaxmiRa",2213,404,"yes","yes","yes","yes",4700);
	    set.add(h2);
	    Hostel h3=new Hostel("LaxmiRamana",2216,404,"yes","yes","yes","yes",4700);
	    set.add(h3);
	  //  System.out.println(set);
	    System.out.println("want to add any hostel details?(0/1)");
	    int i=scan.nextInt();
	    do
	    {
	    if(i==1)
	    {
	    	System.out.println("enter hostel name :");
	    	String hostelName=br.readLine();
	    	System.out.println("enter hostel id :");
	    	int hostelId=scan.nextInt();
	    	System.out.println("enter hostel contact number :");
	    	Long hostelContact=scan.nextLong();
	    	System.out.println("WiFi Facility(yes/no) :");
	    	String wifi=br.readLine();
	    	System.out.println("hot water(yes/no) :");
	    	String hotWater=br.readLine();
	    	System.out.println("washing Machine (yes/no) :");
	    	String washingMachine=br.readLine();
	    	System.out.println("Ac(yes/no) :");
	    	String ac=br.readLine();
	    	System.out.println("rent :");
	    	int rent=scan.nextInt();
	    	Hostel hostel=new Hostel(hostelName,hostelId,hostelContact,wifi,hotWater,washingMachine,ac,rent);
	    	set.add(hostel);
	    	System.out.println("wanna add one more hostel details (yes/anything):");
	    }else
	      System.out.println("Thank you  :)");
	    }while (scan.next().equals("yes")); 
	    Iterator<Hostel> iter = set.iterator();
	    
	    while (iter.hasNext())
	    {
	        Hostel host = (Hostel) iter.next();
	     
	        System.out.println(host);
	    }
	    //System.out.println(set);
	      
	    
	    br.close();
	    scan.close();
	    }  
	}


