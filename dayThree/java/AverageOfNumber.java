
//Program to calculate average of numbers from 1 to 100

public class AverageOfNumber{

public static void main(String [] args){

	int number = 100;
	int sum = 0;
	
	for (int count = 1; count< number; count++){
	
			sum+=count;
			
			int average = sum/count;
	
	
		
		System.out.println(average);
		
		}
	}
}
