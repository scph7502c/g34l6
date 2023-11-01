package first.project;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println(getTextLength("Damian"));
        System.out.println(getTextLength(null));
    }

   public static int getTextLength(String text){
//      if(StringUtils.isEmpty(text)){
//          return 0;
//      }
        return text.length();
   }
}


