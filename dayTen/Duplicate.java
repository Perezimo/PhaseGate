
public class Duplicate{
public static void main(String [] args){

int [] arr = {3, 4, 6, 3, 5};
System.out.println(hasDuplicate(arr));
}

public static boolean hasDuplicate(int[] array) {

    for (int count = 0; count < array.length; count++) {

        for (int counter = count + 1; counter < array.length; counter++) {

            if (array[count] == array[counter]) {
                return true;
            }
        }
    }

    return false;
}

}
