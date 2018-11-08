import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        String stronaLewa = readFromConsole("lewej");
        String stronaPrawa = readFromConsole("prawej");

        char[] charLewy = stronaLewa.toCharArray();
        char[] charPrawy = stronaPrawa.toCharArray();

        int sumaLewa = sumaLewa(charLewy);
        int sumaPrawa = sumaPrawa(charPrawy);

        whoWon(sumaLewa, sumaPrawa);
    }
    // Modyfikacja tabeli zbudowanej z char, ze wzgledu na "bomby" - znak "*"



    static void whoWon(int sumaLewa, int sumaPrawa){
        if (sumaLewa > sumaPrawa){
            System.out.println( "Wygrała strona lewa");
        } else if (sumaLewa == sumaPrawa){
            System.out.println("Jest remis");
        }
        else {
            System.out.println("Wygrala strona prawa");
        }
    }

    static int sumaLewa(char[] charLewy) {
        int sumaLewa = 0;
        for (char x : charLewy) {
            if (x == 'w') {
                sumaLewa += 4;
            } else if (x == 'p') {
                sumaLewa += 3;
            } else if (x == 'b') {
                sumaLewa += 2;
            } else if (x == 's') {
                sumaLewa += 1;
            }
        }
        return sumaLewa;
    }
    static int sumaPrawa(char[] charPrawy) {
        int sumaPrawa = 0;
        for (char x : charPrawy) {
            if (x == 'm') {
                sumaPrawa += 4;
            } else if (x == 'q') {
                sumaPrawa += 3;
            } else if (x == 'd') {
                sumaPrawa += 2;
            } else if (x == 'z') {
                sumaPrawa += 1;
            }
        }
        return sumaPrawa;
    }

        static String readFromConsole (String strona){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz znaki dla strony " + strona);
            return scanner.nextLine();
        }
    }
