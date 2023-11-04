package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {

    @Test
    void shouldCheckWhatDay() {
//given
        int dayNumber = 1;
        String expected = "Monday";

//when
        String result = DaysOfWeek.checkDayOfWeek(dayNumber);

//then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfWeekend() {
//given
        int dayNumber = 6;
        String expected = "Weekend";

//when
        String result = DaysOfWeek.checkDayOfWeek(dayNumber);

//then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfDayNotExist() {
//given
        int dayNumber = 8;
        String expected = "There is no such a day!";

//when
        String result = DaysOfWeek.checkDayOfWeek(dayNumber);

//then
        Assertions.assertEquals(expected, result);
    }
}
