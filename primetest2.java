package project281;
import java.util.Scanner;
public class primetest2 {

	public static void main(String[] args) {
		int k,n;
		Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of times to test for primality: ");
			k = input.nextInt();
			System.out.println("Enter a value to test for primality: ");
			n = input.nextInt();
			
		if(FermatMethod(k, n)) {
			 System.out.println("probably Prime");}

			 else
				 System.out.println("Composite");
		
		
	}
	
	
 public static boolean FermatMethod(long k , long n){
	
	//looping through the accuracy
		while(k > 0) {
			
		long a = 2+(int)Math.random()*(n-4);//generating a random number between 2 and n-2
		long x = modPow(a, n-1, n); // calculating a^(n-1) mod n
		
		

		if(gcd(a , n)!= 1) //checking if they arent co prime that mean it wont be a prime
			return false;
		
		if(x%n != 1) // checking if the reminder isnt equal to 1 it will be composite as well
			return false;
		
		k--; // updating the accuracy
			}
		
				return true;
				
	}
	
	
		
		
		
	

	public static long gcd(long a , long b) { // recurisve method that calaculates the gcd
		
		
		if(a > b) { 
			
			if(b == 0)
				return a;
			
			else return gcd(b , a % b);
			
			
		}
		
		else {
			if(a == 0)
				return b;
			else return gcd(a , b %a);	
		}}
	
	  public static long modPow(long a, long b, long c)
	    {
	        long res = 1;
	        for (int i = 0; i < b; i++) // looping through n-1
	        {
	            res *= a; // res = res*a
	            res %= c; // res = res%c
	        }
	        return res % c;
	    }
	
}
		


