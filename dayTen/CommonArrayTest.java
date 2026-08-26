import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommonArrayTest{ 


@Test
void commonElementsTest1() {

    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {3, 4, 5, 6};

    int[] result = CommonElements.commonElements(array1, array2);

    assertArrayEquals(new int[]{3, 4}, result);
}
}
