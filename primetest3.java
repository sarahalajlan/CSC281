package project281;
import java.util.Scanner;
public class primetest3 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int k,n;
		System.out.println("Enter the number of times to test for primality: ");
		k = input.nextInt();
		System.out.println("Enter a value to test for primality: ");
		n = input.nextInt();
		
	if(millerRabinIsPrime(n, k))
		System.out.println("probably prime");
		
		else
			System.out.println("composite");

		
	}
	
	
     public static boolean millerRabinIsPrime(int n, int k) {
		// taking care of cases under 2
		if(n < 2) 
			return false;
		
		if(n == 2)
			return true;
		
		if(n % 2 == 0) // there is no even number thats prime except 2
			return false;
		
	
		long m = 0;
		long e = 0;
		for(int i = 1; i < n-1 ; i++) { // trying to find the right number m and exponent that multipling the will = n-1
			int x = (int)Math.pow(2, i);
			
			if((n-1)%x == 0) {
			m = (n-1)/x;
			 e = i;
			}
			
			
			if((n-1)%x != 0)
				break;
		}
		
	ver:	for(int i = 0; i < k ; i++) { //looping through the accuracy
			
			long a = 2+(long)Math.random()*(n-3); // generating random number between 2 and n-2
			long x = modPow(a , m ,n); // calaculting a^(m)mod n
			
			  if(x == 1 || x == n-1) // if it holds we continue 
				continue;
			
		for(int j = 0 ; j < e ; j++) { // if the previous condtion didn't hold we will loop though the exponent
				
				x = modPow(x , 2 ,n); // calaculate x^2 mod n
				
				if( x == 1) // checking if x == 1 we return false meaning its composite
					return false;
				
				if(x == n-1) // checking if x == n-1 meaning we need to continue the outer loop to be more accurate
					continue ver;
				
				
			}
		
		return false; // none of the condtions were true it means its composite since the if statemnts that proves its prime didn't hold
		}
		
		return true; // returning true since some number will never eneter the nested loop meaning its prime
		
	
	}
    
     
     public static long modPow(long a, long b, long c)
	    {
	        long res = 1;
	        for (int i = 0; i < b; i++) // looping through n-1 
	        {
	            res *= a; // res = res *a 
	            res %= c; // res = res%c
	        }
	        return res % c;
	    }


	
	
}
