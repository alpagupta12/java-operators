package dots.classes.java;

public class Operators {

	public static void main(String[] args) {
		
      //<------------------- Arithmetic Operators------------------------->
		
		// declare variables
	    int a = 20, b = 40;

	    // addition operator
	    System.out.println( "a+b= " + (a+b));

	    // subtraction operator
	    System.out.println("a - b = " + (a - b));

	    // multiplication operator
	    System.out.println("a * b = " + (a * b));

	    // division operator
	    System.out.println("a / b = " + (a / b));

	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    
	    // Divison with decimal
	     
	    int x = 5 ; 
	    double y = 6.9 ;
	    
	    System.out.println("x/y =" + (x/y));
	    
	  //<---------------------Assignment Operators-------------------------->
	    
	 
	 // create variables
	    int z = 4;
	    int var;

	    // assign value using =
	    var = z;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += z;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= z;
	    System.out.println("var using *=: " + var);
	    
	    
	    
	//  <------------------------------Relational Operators--------------------------> 
	    
	 

	    // value of a = 20  and b = 40
	 
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // false

	    // < operator
	    System.out.println(a < b);  // true

	    // >= operator
	    System.out.println(a >= b);  // false

	    // <= operator
	    System.out.println(a <= b);  // true
	    
	    
	    
	    // <---------------------------------Logical Operators--------------------------------------->
	    
	 // && operator
	    
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    
	  }
	
	}


