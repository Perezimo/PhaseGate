
public class SumOfDigits{

public static void main(String [] args){


	System.out.println(addDigitsNumbers(33));

}

public static int addDigitsNumbers(int number){
	
	int sumDigits = 0;
	
	while(number != 0){
	
		int digit = number % 10;
		 
		 sumDigits += digit;
		 
		 number/=10;
		 
		 
		 }
		

	return sumDigits;
		
	}
}

	
		
