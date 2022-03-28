package DayFourTest;

import com.bootcamp.assignments.DayFour.DayFour;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class DayFourTest {

    @Test
    public void canReturnArrayList() {

        DayFour dayFour = new DayFour();

        ArrayList<String> returnedValue =  new ArrayList<String>(Arrays.asList("blue", "red", "black", "yellow", "purple", "orange", "beige"));

        assertEquals("lists not equal", returnedValue, dayFour.firstAssignment());
    }
}
