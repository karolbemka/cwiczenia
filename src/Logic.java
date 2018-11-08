public class Logic {

    public static void main (String[] args){

        boolean isCIrcle = true;
        double r = 11;

        boolean isBigCircle = isCIrcle && r > 10;

        if (isBigCircle){
            System.out.println("To jest duze kolo");
        }
        else if (isCIrcle){
            System.out.println("To jest male kolo");
        }
        else{
            System.out.println("To nie jest w ogole kolo");
        }
    }
}
