public class TimeTest {

    enum Hemisphere {
        WEST, EAST;

    public static void main(String[] args) {

        double myPoint = 98.123;
        double destPoint = 123.123;
        Hemisphere myHemisphere = Hemisphere.EAST;

        double myTimeHour = 10;
        double myTimeMinutes = 25;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;

        if (myHemisphere == Hemisphere.WEST) {
            myPoint *= -1;
        }

        if (destHemisphere == Hemisphere.WEST){
            destPoint *= -1;
        }

        double pointDiff;

        if (myPoint > destPoint) {
            pointDiff = myPoint - destPoint;
        }
        else {
            pointDiff = destPoint - myPoint;
        }
        int pointDiffInMin = (int) pointDiff*4;
        int pointDiffInHr = pointDiffInMin/60;
        int pointDiffInMin1 = pointDiffInMin-pointDiffInHr*60;

        System.out.println(pointDiff);
        System.out.println(pointDiffInHr);
        System.out.println(pointDiffInMin1);
        }



    }
}
