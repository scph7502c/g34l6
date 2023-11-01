package first.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
   void shouldResultProperSum(){
 //given
   double a = 10;
   double b = 90;

   double expectedSum = 100;
 //when
   double result = Calculator.getSum(a, b);

//then
   Assertions.assertEquals(expectedSum, expectedSum);
   }

 @Test
 void shouldResultProperSubstraction(){
  //given
  double a = 10;
  double b = 90;

  double result = -80;
  //when
  double expectedResult = Calculator.getSubstraction(a, b);
//then
  Assertions.assertEquals(expectedResult, result);
   }

 @Test
 void shouldResultProperMultiply(){
  //given
  double a = 10;
  double b = 90;

  double result = 900;
  //when
  double expectedResult = Calculator.getMultiply(a, b);
//then
  Assertions.assertEquals(expectedResult, result);
   }

 @Test
 void shouldResultProperDivision(){
  //given
  double a = 10;
  double b = 90;

  double result = 0.11;
  //when
  double expectedResult = Calculator.getDivide(a, b);
//then
  Assertions.assertEquals(expectedResult, result);
 }

}
