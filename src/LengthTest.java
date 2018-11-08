public class LengthTest {

    public static void main(String[] args) {

        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);

        double lineLength = Math.sqrt((coordinateX2-coordinateX1)*(coordinateX2-coordinateX1)+
                    (coordinateY2-coordinateY1)*(coordinateY2-coordinateY1));
        double lineLength1 = Math.sqrt(Math.pow(coordinateX2-coordinateX1, 2)+Math.pow(coordinateY2-coordinateY1, 2));
        System.out.println(lineLength);
        System.out.println(lineLength1);
    }
}
