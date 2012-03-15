//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class FibonacciAdd{  
      
    public static void main(String[] args) {  
        long i = 1;  
        long j = 2;  
        long k = 3;       
        long sum = 2;  
              
        while(k < 4000000) {  
            if( k%2 == 0) {  
                sum = sum + k;  
            }  
            k = i + j;  
            i = j;  
            j = k;            
        }         
          
        System.out.println(" the sum is "+sum);  
    }  
      
      
}  
