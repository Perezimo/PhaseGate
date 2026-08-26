import java.util.Arrays;
public class AddOneArray{
public static void main(String [] args){
int [] array = {1,2,3,4,9};
System.out.print(Arrays.toString(addOneToLast(array)));

}
public static int[] addOneToLast(int[] array) {

    array[array.length - 1]++;

    if (array[array.length - 1] >= 10) {

        int[] newArray = new int[array.length + 1];

        for (int count = 0; count < array.length - 1; count++) {
            newArray[count] = array[count];
        }

        newArray[array.length - 1] = 1;
        newArray[array.length] = 0;

        return newArray;
    }

    return array;
}
}
