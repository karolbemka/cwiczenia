import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        int tableSize = readFromConsole();
        int[] table = new int[tableSize];
        boolean continueCheck = true;

        fillTable(table,tableSize);
        int t = t();

        // FOR TESTING
//        int [] table = {1, 2, 3, 4, 5, 6};
//        int t = 2;

        while (moreThanOne(table) && continueCheck(table, continueCheck, t)) {
            table = newTable(table, t);
            printOutTable(table);
            continueCheck(table,continueCheck, t);
            }
        System.out.println("Koncowa tabela to ");
        printOutTable(table);
        }
    static int[] newTable(int[] table, int t) {

            for (int i = 0; i <= table.length - 2; i++) {
                for (int j = i + 1; j <= table.length - 1; j++) {
                    if (table[i] + table[j] == t) {
                        int[] newTable = new int[table.length - 1];
                        System.out.println("Pasujący element tablicy to = " + table[j]);
                        for (int z = 0; z < j; z++) {
                            newTable[z] = table[z];
                        }
                        for (int z = j; z < newTable.length; z++) {
                            newTable[z] = table[z + 1];
                        }
                        table = newTable;
                    } else {
                        System.out.println("Nie ma pasującego elementu tablicy");
                    }
                }
            }
        return table;
        }

    static boolean continueCheck(int[] table, boolean continueCheck, int t){
            int counter = 0;
            for (int i = 0; i <= table.length - 2; i++) {
                for (int j = i + 1; j <= table.length - 1; j++) {
                    if (table[i] + table[j] == t) {
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                continueCheck = true;
            } else {
                continueCheck = false;
            }
            return continueCheck;
        }

    static void printOutTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }

    static boolean moreThanOne(int[] table) {
        return table.length != 1;
    }

    static int readFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość miejsc w twojej tablicy = ");
        return input.nextInt();
    }

    static int[] fillTable(int[] table, int tableSize) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tableSize; i++) {
            System.out.println("Podaj wartość dla " + i + " miejsca w tablicy");
            int a = input.nextInt();
            table[i] = a;
            System.out.println(table[i]);
        }
        return table;
    }

    static int t() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosc dla t = ");
        return input.nextInt();
    }
}