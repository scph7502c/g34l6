package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerifyTest {

@Test
    void shouldCheckIfNotAdult(){
//given
    int age = 16;
    String expected = "Niepełnoletni";

//when
String result = AgeVerify.checkIfAdult(age);

    Assertions.assertEquals(expected, result);
    }


    @Test
    void shouldCheckIfIsAdult(){
//given
        int age = 19;
        String expected = "Pełnoletni";

//when
        String result = AgeVerify.checkIfAdult(age);

        Assertions.assertEquals(expected, result);
    }
}
