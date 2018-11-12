// Napisz metodę, która przyjmie od użytkownika literał (String) i wyświetli na ekran wszystkie
// litery alfabetu łacińskiego, które NIE występują w podanym Stringu.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        String givenString = readFromConsole();
        char[] charArray = givenString.toCharArray();

        char a = 'a';
        char z = 'z';
    }

    static boolean notInString(char[] charArray){
        char a = 'a';
        char z = 'z';
        boolean isThere = true
        for (int i = (int) a; i < (int) z +1; i++){
            for (int j = 0; j < charArray.length; j++) {
                if (i == (int)charArray[j]){
                    isThere = true;
                    break;
                }
            } if (isThere = false){
                System.out.println((char) i);
            }
        }
        return isThere;
    }

    static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciag znakow ");
        return scanner.nextLine();
    }
}
