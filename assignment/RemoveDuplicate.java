package week3day1.assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "We learn java basics as part of java sessions in java week1";
		//String output ="";
		//int count = 0;
		String[] subString = input.split(" ");
		
		for(int i=0 ; i<subString.length;i++) {
			
			for(int j=i+1;j<subString.length;j++) {
		
			  if(subString[i].equals(subString[j])) { 
				  subString[j] = " ";
				    
			  }
			}
		}	
		
		for(int i=0 ; i<subString.length;i++) {
			System.out.print(" " +subString[i]);
		}
	}		
}
