package project281;
import java.util.Scanner;
public class primetest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value to test for primality:");
		int x = input.nextInt();
	
		
		if(TrialDevision(x))
			System.out.println("prime");
		
		else
			System.out.println("composite");
	    
			
		
	
		
	}
	
	
	public static boolean TrialDevision(int n) {
		
		
		// calculating the square root of n
		int limit = ((int)Math.ceil(Math.sqrt(n)));
		
		
		boolean isprime = true;
		
		//looping through all the numbers from 2 to root of n 
		for(int i = 2 ; i <= limit ; i++) 
			if(n%i == 0) //check if any of numbers yelid zero reminder
				isprime = false;
	
		//printing factors
		if(isprime == false) {
		
		        for (int i = 1; i <= n; i+= 1)
		        {
		         if(n%i == 0)
		        	 System.out.print(i+ ",");
		         
		        }
		 
		    return isprime;}
	        
	        else
	        	return isprime;
			
	} 
	
	
	
	
}
