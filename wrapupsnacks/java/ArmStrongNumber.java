import java.util.Scanner;
public class ArmStrongNumber{

public static void main(String [] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter digit of numbers to check for armstrong number: ");

int digits = scanner.nextInt();
String numberString = digits + ""; 
int keepDigit = digits;
int sum = 0;
for(int count = 1; count<=numberString.length(); count++){
	sum+=Math.pow(digits%10, numberString.length());
	digits /=10;
}
if(sum == keepDigit){
System.out.println("Number is an Armstrong");
}else{
System.out.println("Number is not an Armstrong");
}

}
}

