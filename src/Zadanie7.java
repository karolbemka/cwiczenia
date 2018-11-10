//import java.util.Scanner;
//
//public class Zadanie7 {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj ilość miejsc w twojej tablicy = ");
//        int n = input.nextInt();
//        System.out.println(n);
//
//        int[] tablica = new int[n];
//        int[] nowaTablica = new int[tablica.length - 1];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Podaj wartość dla " + i + " miejsca w tablicy");
//            int a = input.nextInt();
//            tablica[i] = a;
//            System.out.println(tablica[i]);
//        }
//        System.out.println("Podaj wartość liczby t = ");
//        int t = input.nextInt();
//        boolean moreThanOne = false;
//        boolean continueCheck = false;
//        while (!moreThanOne) //sprawdz czy jest wiecej jak 1 element, jesli tak to wykonaj petle, jesli nie to wypisz ze jest tylko 1 element i nie da sie wykonac dzialania.
//            if (tablica.length > 1) {
//                while (!continueCheck) // Sprawdz czy ??
//                    for (int i = 0; i < tablica.length - 1; i++) {
//                        for (int j = i + 1; j < tablica.length - 1; j++) {
//                            if (tablica[i] + tablica[j] == t) {
//                                System.out.println("Pasujący element tablicy to = " + tablica[j]);
//                                for (int z = 0; z < j; z++) {
//                                    nowaTablica[z] = tablica[z];
//                                }
//                                for (int z = j; z < nowaTablica.length; z++) {
//                                    nowaTablica[z] = tablica[z + 1];
//                                }
//                                tablica = nowaTablica;
//                            } else {
//                                System.out.println("Nie ma pasującego elementu tablicy");
//                            }
//                        }
//                        continueCheck = true;
//                    }
//                for (int i = 0; i < tablica.length; i++) {
//                    System.out.println(tablica[i]);
//                }
//            } else {
//                System.out.println("Za malo elementow w tabeli, nie da sie tego wykonac.");
//                break;
//            }
//    }
//}
