import java.util.Scanner;

public  class Factorials{
public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number to get its factorial: ");

int number = scanner.nextInt();
int sum = 1;

for( int count=number; count>=1; count--){


	sum *=count;
	}
	System.out.println(sum);
	
	
}
}

