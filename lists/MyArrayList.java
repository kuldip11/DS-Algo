package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList(); //create an string type empty list 'fruits'
		
		fruits.add("Apple"); //add 'Apple' in the empty list 'fruits' 
		fruits.add("Orange"); //add 'Orange' in the list
		fruits.add("Hi"); //add 'Hi' in the list
		
		String temp[] = new String[fruits.size()]; 
		
		fruits.toArray(temp); //convert the list into an array and store in temp
		
		for(String e: temp) 
		{
			System.out.println(e); //print the array indicated by 'e'
		}
	}

}
