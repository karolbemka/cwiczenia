//// Napisz metodę, która przyjmie od użytkownika literał (String) i wyświetli na ekran wszystkie
//// litery alfabetu łacińskiego, które NIE występują w podanym Stringu.
//
//import java.util.Scanner;
//
//public class Ex12 {
//    public static void main(String[] args) {
//        String givenString = readFromConsole();
//        char[] charArray = givenString.toCharArray();
//
//
//        if (!inString(someChar(), charArray)){
//            System.out.println(someChar());
//        }
//    }
//
////    static void printOut(char someChar, boolean inString, char[] charArray){
////        if (!inString(someChar(), charArray)){
////            System.out.println(someChar());
////        }
////    }
//
//
//
//     // zrobic petle podajaca someChar
//     static void someChar(boolean inString, char[] charArray) {
//
//         char a = 'a';
//         char z = 'z';
//
//         for (int i = (int) a; i < (int) z + 1; i++) {
//             if (!inString(someChar(), charArray)){
////            System.out.println(someChar());
//         }
//     }
//     }
//
//    static boolean inString(char someChar, char[] charArray) {
//        for (int j = 0; j < charArray.length; j++) {
//            if (someChar() == charArray[j]) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    static String readFromConsole() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj ciag znakow ");
//        return scanner.nextLine();
//    }
//}
