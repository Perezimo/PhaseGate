
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddOneArrayTest{ 

@Test
void addOneToLastTest() {

    int[] input = {1, 2, 9};

    int[] result = AddOneArray.addOneToLast(input);

    assertArrayEquals(new int[]{1, 2, 1, 0}, result);
}
@Test
void addOneToLastTest1() {
    int[] input = {5, 6, 7};

    int[] result = AddOneArray.addOneToLast(input);

    assertArrayEquals(new int[]{5, 6, 8}, result);
}

@Test
void addOneToLastTest2() {
    int[] input = {1, 2, 9};

    int[] result = AddOneArray.addOneToLast(input);

    assertArrayEquals(new int[]{1, 2, 1, 0}, result);

}
}
