package DayFourTest;

import com.bootcamp.assignments.DayFour.IOExercises;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class IOExercisesTest {

    @Test(expected = FileNotFoundException.class)
    public void throwsFileNotFound() throws FileNotFoundException {
        IOExercises ioExercises = new IOExercises();
        File file = new File("/Users/Ernestas/IO test/longestword.tx");

        ioExercises.eighteenExercise(file);

    }
}
