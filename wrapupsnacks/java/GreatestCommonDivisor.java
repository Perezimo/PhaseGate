import java.util.Scanner;

public  class GreatestCommonDivisor{
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");

int firstNumber = scanner.nextInt();

System.out.print("Enter second number: ");
int secondNumber = scanner.nextInt();

int greatestCommonDivisor= 1;
int count = 2;

int smallestNumber=firstNumber;

if(secondNumber<firstNumber) smallestNumber = secondNumber;


while(count<=smallestNumber/2){
if(firstNumber%count==0 && secondNumber % count==0){
greatestCommonDivisor *=count;
firstNumber/=count;
secondNumber/=count;
}else{
count++;
	}
	}
	System.out.println(greatestCommonDivisor);
	
}
}

