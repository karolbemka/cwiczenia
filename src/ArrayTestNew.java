public class ArrayTestNew {

    public static void main(String[] args) {

        int year = -2000;
        String era;
        if (year < 0) {
            era = "BC";
        } else  {
            era = "AD";
        }
        // Jesli year < 0 jest prawda to pierwszy warunek -> BC, jesli nieprawda to drugi warunek -> AD
        era = year < 0 ? "BC" : "AD";

        String[] lista = new String[5];
        lista[0] = "Cos0";
        lista[1] = "Cos1";
        lista[2] = "Cos2";

        for (int i = 0; i < 5; i++) {
            System.out.println(lista[i]);
        }
    }
}

