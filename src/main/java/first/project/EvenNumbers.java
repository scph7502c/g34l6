package first.project;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(checkIfEven(30));
    }

    static String checkIfEven(int number){
        if(number%2 != 0 || number == 0){
            return "Liczba" + " " + number + " " + "nie jest parzysta";
        } else return "Liczba" + " " + number + " " + "jest parzysta";
    }

}