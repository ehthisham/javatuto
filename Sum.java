public class Sum{
	public static void main(String[] args){
		int sum=0;
		int num=0;
		System.out.println("The sum of all natural number below 1000 which are multiples of 3 or 5");
		while (num<999){
			num++;
			if(num%3 == 0 || num%5 == 0){
				sum = sum + num	;		
			}
		}
		System.out.println("The sum is:"+ sum);
	}
		
}

