package iterator;
//Package is a grouping of related types providing access protection and name

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray{//created class ArrayListDemo
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	public static void main(String[] args) { //created main method
		 
		  //static is used for memory management
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
						
		//here I'm creating an array list to add String elements so I made it of string type 
	      
		//ArrayList<String>() : this will create an empty list with initial capacity of 5.
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("meera"); //here I'm adding 5 elements to the array list 
		studentList.add("priya");          //  we are using the add method to add objects to the array list:
		studentList.add("anika");
		studentList.add("gauri");
		studentList.add("bhavya");
		
		 Iterator <String> listIterator = studentList.iterator();//getting Iterator from array list to traverse elements  
	   
		 while (listIterator.hasNext()){       // object next() :it returns the element and moves the cursor pointer to next element.
			
			 String student = (String)listIterator.next(); //traversing elements of ArrayList object  
			
			 if (student.equals("priya")){
				 listIterator.remove();
		//remove(int index) method of arraylist removes the element at the specified position(index) in the list.
				 System.out.println("priya is removed");//here in the output it shows supriya instead of we removed it after this interation it will be removed
			 }
			 
	       System.out.println(student);  
	       //system is final class
		      //out is a static member of system class and type printStream
		      //println is method of printStream class.ln means nextline
	  }

	}
}