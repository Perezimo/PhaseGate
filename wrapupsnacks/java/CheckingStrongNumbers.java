import java.util.Scanner;

public  class CheckingStrongNumbers{
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number to check if it is a strong number: ");

int number = scanner.nextInt();
String numberString = number + "";
int keepDigit = number;
int sum = 0;

	for( int count=1; count<=numberString.length(); count++){
		int digit = keepDigit%10;
		keepDigit/=10;
		int factorial = 1;
		for(int counter=1; counter<=digit; counter++){
			factorial*=counter;
		}
		sum+=factorial;
	}
	if(sum == number){
	System.out.println("It is a strong number!");
	}else{
	System.out.println("It is not a strong number!");	
	}
	
	
}
}
