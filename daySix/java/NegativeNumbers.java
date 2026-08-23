
import java.util.Arrays;
public class NegativeNumbers{

public static void main(String [] args){

	int[] array = {5, -9, 3,-6, 2, -11};
	
	System.out.print(Arrays.toString(negativeArrays(array)));

}

	public static int [] negativeArrays(int[] numbers){
	
	for(int count=0; count<numbers.length; count++){
	
		if(numbers[count] < 0){
		
		
			numbers[count] = 0;
			
		}
			
		}
		
		return numbers;
	}
			

}
