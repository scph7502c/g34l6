package first.project;

public class EvenNumbers {
    static boolean checkIfEven(int number) {
        if (number % 2 != 0 || number == 0) {
            return false;
        } else return true;
    }
}