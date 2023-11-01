package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Maintest {

  @Test
  void shouldReturnProperTextLength() {
 //given
    String textTotest = "Damian";
    int expectedLength = 6;

//when
    int result = Main.getTextLength(textTotest);

//then
    Assertions.assertEquals(expectedLength, result);
  }

  @Test
  void shouldReturn0WhenTextisNull() {
//given
    String textTotest = null;
    int expectedLength = 0;
//when
    int result = Main.getTextLength(textTotest);

//then
    Assertions.assertEquals(expectedLength, result);
  }
}
