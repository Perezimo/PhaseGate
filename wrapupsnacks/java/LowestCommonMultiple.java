
import java.util.Scanner;
public class LowestCommonMultiple{
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");

int firstNumber = scanner.nextInt();

System.out.print("Enter second number: ");
int secondNumber = scanner.nextInt();


int highestNumber=firstNumber;
if(secondNumber>firstNumber) highestNumber = secondNumber;

int lowestCommonMultiple= highestNumber*2;

while(lowestCommonMultiple%firstNumber!=0 || lowestCommonMultiple % secondNumber!=0){
	lowestCommonMultiple++;

	}
	System.out.println(lowestCommonMultiple);
	
}

}


