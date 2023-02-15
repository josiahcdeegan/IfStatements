package IfStatements;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
if(s .equals("1")) { 

	  System.out.println("I can buy 1 hamburger for lunch!"); 

	} 

	else if(s .equals("2")) { 
		  System.out.println("I can buy 2 hamburgers for lunch!"); 
	} 
	else if(s .equals("3")) { 
		  System.out.println("I can't buy 3 hamburgers for lunch!"); 
	} 
	else { 

	  System.out.println("Nuts! I can't buy any hamburgers!"); 

	} 

	}

}
//== is considered an operator in Java, is mostly used to compare the reference values and objects, 
//We can use it with objects and primitives, The can’t compare conflicting objects, It cannot be overridden.
//Equals() is considered as a method in Java, It is used to compare the actual content of the object, 
//We cannot use it with primitives, It can compare conflicting objects, It can be overridden.