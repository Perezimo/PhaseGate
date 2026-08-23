import java.util.Arrays;
public class ZeroSorting{

public static void main(String [] args){

	int[] array = {3,0,5,0,2,0};
	
	System.out.print(Arrays.toString(zeroEndArrays(array)));

}

	public static int [] zeroEndArrays(int[] numbers){
		int temporarHolder = numbers[0];
		int counter=0;
		int[] newArray = new int[numbers.length];
		for(int count = 0; count<numbers.length; count++){
		if(numbers[count]!=0){
		newArray[counter] = numbers[count];
		counter++;
		}
		}
		
		
		
		return newArray;
	}
			

}
