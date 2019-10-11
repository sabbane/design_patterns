package sabbane.design_patterns.behavioral.null_object;

/**
 * Null Object Pattern
 * 
 * 	- motivation: references may be null !!!
 * 	- it can be very elaborate to deal with null references
 * 	- we have to check whether a reference is null or not -> NullPointerException
 * 			if we call methods on null objects
 * 
 * 	GOOD TO AVOID NULL REFERENCES For example: return empty ArrayList instead of null ...
 * 		Or we have to use several if() checks whether the reference is null
 * 			For example: dealing with binary trees
 * 
 * 			class Node {
 * 				
 * 				private int data;
 * 				private Node leftChild;
 * 				private Node rightChild;
 * 
 * 				...
 * 			}
 * 	
 * 	SOLUTION: the null object design pattern
 * 
 * 		We create an abstract class specifying various operations to be done
 * 		 Concrete classes extending this class and a null object class providing
 * 			 do nothing implemention of this class
 * 				~ this approach can be used where we need to check null value !!!
 * 
 */

public class NullObjectMain {

	public static void main(String[] args) {
		CustomerController customerController = new CustomerController();
		System.out.println("Custoemr Name: " + customerController.getCustomerByName("Nadine").getName());
		System.out.println("Custoemr Name: " + customerController.getCustomerByName("Faycal").getName());
	}
}
