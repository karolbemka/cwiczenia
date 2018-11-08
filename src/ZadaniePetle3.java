import java.util.Scanner;

public class ZadaniePetle3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nieujemna liczbe= ");
        int firstNumber = in.nextInt();

        int suma0 = 0;
        int suma1 = 1;
        int suma2 =suma0+suma1;
        for (int i = 0; i <=firstNumber-3; i++){
            suma0 = suma1;
            suma1 = suma2;
            suma2 = suma0+suma1;
        }
        if (firstNumber == 0){
            System.out.println("0");
        }
        else if (firstNumber == 1) {
            System.out.println("1");
        }
        else
            System.out.println(suma2);
    }
}
