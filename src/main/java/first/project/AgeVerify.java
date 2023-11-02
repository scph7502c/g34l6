package first.project;

public class AgeVerify {
   public static void main(String[] args) {
     System.out.println(checkIfAdult(17));
  }
static boolean checkIfAdult(int age){
  if(age >= 18){
    return true;
   } else return false;
  }
}

