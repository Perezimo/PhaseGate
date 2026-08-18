
public class PalindromeCheck{

    public static boolean isPalindrome(int number){
       
		int original = number;
		
		int reversed = 0;
		
		while(original > 0){
			int lastDigit = original % 10;
			reversed = (reversed * 10) + lastDigit;
			original /= 10;
		}
		if (number == reversed){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPalindromeCheck(int number){
		if(number <0) {
		
			return isGreaterThanZero(number);
		}		
		else if(number>=0 && number<10){
		
			return isPositiveSingleDigit(number);
		}
		else if(number >= 10){
		
			return isPalindrome(number);
			
		}
		else{
		return false;
		}	
	}	
}  
