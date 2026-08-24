import java.util.Arrays;
public class Question3{

public static void main(String [] args){

	int[][] array = {{3,5,7},{2,2,2},{4,1,9}};

	System.out.print(Arrays.toString(addAllInnerElement(array)));
	
	}

public static int[] addAllInnerElement(int[][] array){
    
    int[] newArray = new int[array.length];
    
    for(int count = 0; count< array.length; count++){
    
        for(int counter=0;counter<array[count].length;counter++){
    
            newArray[count] += array[count][counter];
    
        }
   
    }
    
    return newArray;
}

}
