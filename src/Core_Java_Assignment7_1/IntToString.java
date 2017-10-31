/*Write a program to convert an int variable to String using an inbuilt function of String class.*/

package Core_Java_Assignment7_1;  //Package declaration is mandatory

	public class IntToString{  
		public static void main(String args[]){  
		int i=150;  
		String s=Integer.toString(i);  
		System.out.println(i+50);     //200 because + is binary plus operator  
		System.out.println(s+50);     //15050 because + is string concatenation operator  
		
	
	}

}

	