//Find the sum of all the primes below two million?
import static java.lang.Math.sqrt;
public class PrimeSum{
	public static void main(String[] args){
		long n = 2;
		long sum = 2; 
		int is_not_prime = 0;
		while (n < 2000000){
			n++;
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i == 0){
					is_not_prime = 1;
				}
			}
			if(is_not_prime ==0){
				sum = sum + n;
			}
			is_not_prime = 0;
		}
		System.out.println(sum);
	}
}
