public class TestApplication {

    public static void main (String[] args){
        System.out.println("Hello World");
        /*
        int myNumber;
        myNumber = 10;
        float mySecondNumber = 2.1f;

        String myText = "To jest moj napis";
        char myChar = 'a';

        float myAnotherNumber = (mySecondNumber +10.5f) * 2;

        myNumber = myNumber -1;
        myNumber -= 1;
        myNumber--;
        myNumber += 1;
        myNumber *= 1;
        myNumber /= 2;



        System.out.println(myNumber);
        System.out.println(mySecondNumber);
        System.out.println(myText);
        System.out.println(myChar);
        System.out.println(myAnotherNumber);
        */

        byte myNumber = 127;
        myNumber += 1;

        int my1Number = 256;
        int my2Number = 20;

        int myChar = 'k';
        char myNewChar = 'b' + 1;

        byte result = (byte) my1Number;

        System.out.println(result);
        System.out.println(myChar);
        System.out.println(myNewChar);
    }
}

