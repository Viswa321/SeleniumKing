package Automation;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		
			ArrayList<String> arr = new ArrayList<String>() ;
			arr.add("Viswa");
			arr.add("Selenium");
			arr.add("Automation");
			arr.add("learning");
			 
			for (int i = 0; i <arr.size(); i++) {
				System.out.println(arr.get(i)); 
				
			
			}
			System.out.println(arr.contains("Selenium"));
	}
	

}
