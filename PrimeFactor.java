//Find the largest prime factor of a composite number.
public class PrimeFactor{
	public static void main(String[] args){
		long n = 600851475143L; 
		int factor = 3; 
		while( n > 1)
		{
		    if(n % factor == 0)
		    {
			n/=factor;
		    }else
			factor += 2; 
		}
		System.out.println (factor);
	}
}
