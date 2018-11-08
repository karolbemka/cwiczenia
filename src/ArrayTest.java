public class ArrayTest {

    public static void main(String[] args) {

        int xCoordinatesCount = 1000;
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] zCoordinates = new int[5];
        zCoordinates[0] = 1;
        zCoordinates[1] = 2;
        zCoordinates[2] = 3;
        zCoordinates[3] = 4;
        zCoordinates[4] = 5;

        int[] xCooordinates = new int[xCoordinatesCount];

        System.out.println(zCoordinates[3]);
        System.out.println(yCoordinates[3]);
        System.out.println(xCooordinates[0]);

        for (int i = 0; i < xCoordinatesCount; i++) {
            xCooordinates[i] = i;
        }
        //for each (dla kazdego)
        int sum = 0;
        for (int yCordinate : yCoordinates){
            sum =+ yCordinate;
        }

        int i = 0;

        while (i < 5) {
            if ( i ==3) {
                i++;
                continue;
            }
        }



    }
}
