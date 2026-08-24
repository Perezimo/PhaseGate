import java.util.Arrays;
public class ArrayNumbers{

public static void main(String [] args){

	int[] array = {2, 8, 14, 5, 1};
	
	System.out.print(Arrays.toString(numArrays(array)));

	
	}
	
	
	public static int [] numArrays(int[] numbers){
	
	for(int count=0; count<numbers.length; count++){
	
		if(numbers[count] % 2 == 0){
		
			numbers[count]*=2;
			
		}
		else{
		
			numbers[count] += 1;
			
		}
		
			}
			return numbers;

	}
	
}

		
