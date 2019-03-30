package codecool;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {

    private Flat flat;
    private List<Object> result;

    @BeforeEach
    void setUp() {
        flat = new Flat();
        result = new ArrayList<>();
    }

    @Test
    void testFlatMethodReturnsSpecifiedListInCorrectFormat() {
        Object[] singlyArray = new Object[] {2, 7};
        Object[] doublyArray = new Object[] {5, 11, singlyArray};
        Object[] entireArray = new Object[] {1, 3, "Kraków", singlyArray, doublyArray};

        Object[] actual = flat.flat(entireArray, result).toArray();
        Object[] expected = new Object[] {1, 3, "Kraków", 2, 7, 5, 11, 2, 7};

        assertArrayEquals(expected, actual);
    }
}