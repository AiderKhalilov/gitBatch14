public class Task2AccessMod {

           public static String name(String firstName) {
              String reversedStr = "";
              for (int i = 0; i < firstName.length(); i++) {
                  reversedStr = firstName.charAt(i) + reversedStr;
              }
               return reversedStr;
          }

        public static void main(String[] args) {

        }
    }


