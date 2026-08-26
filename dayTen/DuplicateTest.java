import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

public class DuplicateTest {


@Test
void hasDuplicateTest1() {
    int[] input = {1, 2, 3, 4};

    assertFalse(hasDuplicate(input));
}

@Test
void hasDuplicateTest2() {
    int[] input = {1, 2, 3, 2, 4};

    assertTrue(hasDuplicate(input));
}

@Test
void hasDuplicateTest3() {
    int[] input = {5, 5, 7, 8};

    assertTrue(hasDuplicate(input));
}
}

