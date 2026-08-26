
import java.util.Arrays;
public class CommonElements{
public static void main(String [] args){

	int[] arr1 = {2, 4, 6, 2, 1};
	int[] arr2 = {3, 4, 2, 2,5};
	System.out.print(Arrays.toString(commonElements(arr1 , arr2)));
}

public static int[] commonElements(int[] array1, int[] array2) {

    int[] common = new int[array1.length];
    int index = 0;

    for (int count = 0; count < array1.length; count++) {

        boolean found = false;

        for (int counter = 0; counter < array2.length; counter++) {

            if (array1[count] == array2[counter]) {
                found = true;
                break;
            }
        }


        if (found) {

            boolean alreadyAdded = false;

            for (int counter = 0; counter < index; counter++) {

                if (common[counter] == array1[count]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                common[index] = array1[count];
                index++;
            }
        }
    }

    int[] result = new int[index];

    for (int count = 0; count < index; count++) {
        result[count] = common[count];
    }

    return result;
}
}
