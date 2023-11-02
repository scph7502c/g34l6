package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumbersTest {

@Test
    void shouldCheckIfEven(){
//given
    int number = 4;
    boolean expected = true;

//when
    boolean result = EvenNumbers.checkIfEven(number);

//then
    Assertions.assertEquals(expected, result);
    }


@Test
    void shouldCheckIfNotEven(){
//given
    int number = 5;
    boolean expected = false;

//when
    boolean result = EvenNumbers.checkIfEven(number);

//then
    Assertions.assertEquals(expected, result);
    }
}
