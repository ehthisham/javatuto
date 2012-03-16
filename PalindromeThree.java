//Find the largest palindrome made from the product of two 3-digit numbers
import java.lang.*;
public class PalindromeThree{
	
	public static void main(String[] args){
	String stringNum;
	String reversedString;
	String answer="";
	int x = 999;
	int y = 0;
	int z = 0;
int flag=0;
		for(int i=998001;i>100*100;i--){
			stringNum = Integer.toString(i);
			reversedString = reverseIt(stringNum);
			if (stringNum.equals(reversedString)){
			
				for(x=999;x>100;x--){
					for(y=0;y<999;y++){
					z = x*y;
						if(i==z){
						answer = stringNum;
						System.out.println("Multipliers are:"+x+", "+y);
						System.out.println("and the Largest palindrome is, "+answer);
						
						flag=1;					
						break;
						}						
					}
					if (flag==1){break;}
				}
			}
									if (flag==1){break;}
		}
	}
	
	public static String reverseIt(String s){
		char c[] = s.toCharArray();
		int i=0,j=c.length -1;
		while (i<j){
			char tmp=c[i];
			c[i] = c[j];
			c[j] = tmp;
			i++;
			j--;
		}
		return new String(c);
	}
}
