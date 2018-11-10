import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

//        int tableSize = readFromConsole();
//        int[] table = new int[tableSize];


//        fillTable(table,tableSize);
        // testy
        int[] table = {5, 10, 10, 15};
//        int t = t();
        int t = 15;


        boolean continueCheck = true;

        while (moreThanOne(table) && continueCheck) {
            for (int i = 0; i <= table.length - 2; i++) {
                System.out.println("hi!");
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
            for (int i = 0; i < table.length; i++) {
                System.out.print(table[i]);
            }
            System.out.print("\n");
            for (int i = 0; i <= table.length - 2; i++) {
                int counter = 0;
                for (int j = i + 1; j <= table.length - 1; j++) {
                    if (table[i] + table[j] == t) {
                        counter ++;
                    }
                }
                if (counter = 0){

                }
            }


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
