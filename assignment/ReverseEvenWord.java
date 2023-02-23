package week3day1.assignment;
/* Pseudo Code:

 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/

public class ReverseEvenWord {

	public static void main(String[] args) {
       String test = "I am a software tester";
       String[] subString = test.split(" ");
       //String rev="";
       for (int i=0;i<subString.length;i++) {
    	   String rev="";
    	        if(!(i%2==0)) {
    	        	char[] charArray = subString[i].toCharArray();
    	        	for(int j=charArray.length-1;j>=0;j--) {
    	        		
    	        		rev= rev+ charArray[j];
    	        	}
    	        	subString[i]=rev;
    	        }
    	        System.out.print(" " +subString[i]+" ");
       }
      //System.out.print(subString);
	}

}
