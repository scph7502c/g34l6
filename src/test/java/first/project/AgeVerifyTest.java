package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeVerifyTest {
@Test
    void shouldCheckIfAdult(){
//given
    int age = 16;
    String expected = "Niepełnoletni";

//when
String result = AgeVerify.checkIfAdult(age);

    Assertions.assertEquals(expected, result);
    }
}
