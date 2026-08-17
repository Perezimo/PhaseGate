
import java.util.Scanner;

public class GreetingName{

public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Please Enter Your Name: ");

	String name = input.nextLine();
	int day = 17;
	int month = 8;
	int year = 2026;

System.out.println("\" My name is " +  " \""  + name + "\"");
System.out.println("\"Today is " + day + "/0" + month + "/" + year + "\"");
	}
}
