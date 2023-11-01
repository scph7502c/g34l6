package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumbersTest {

@Test
    void shouldCheckIfEven(){
//given
    int number = 4;
    String expected = "Liczba 4 jest parzysta";

//when
    String result = EvenNumbers.checkIfEven(number);

//then
    Assertions.assertEquals(expected, result);
    }


@Test
    void shouldCheckIfNotEven(){
//given
    int number = 5;
    String expected = "Liczba 5 nie jest parzysta";

//when
    String result = EvenNumbers.checkIfEven(number);

//then
    Assertions.assertEquals(expected, result);
    }
}
