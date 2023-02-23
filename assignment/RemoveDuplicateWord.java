package week3day1.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
	String input = "We learn java basics as part of java sessions in java week1";
	String[] subString = input.split(" ");
	Set<String> setStr = new LinkedHashSet<String>();
	      
	   for(int i=0;i<subString.length;i++) {
		   
		   setStr.add(subString[i]);
		
		
	}
	 Object[] array = setStr.toArray();
	 for(int i=0;i<array.length;i++) {
		 
		 System.out.print(" " +array[i]);
		 
	 }

	}

}
