package oop;

    public class Diamond extends Figure {

        private double e; // private brak mozliwosci zmiany
        private double f; // jest mozliwosc zmiany pola po pierwotnym przypisaniu jak jest "public"
        private double a;

        public Diamond(double e, double f, double a, String color) {
            super(color);
            this.e = e;
            this.f = f;
            this.a = a;

        }
//        Przeciazanie
        public Diamond(double a, String color) {
            super(color);
            this.a = a;
            e = a / 10;
            f = a / 5;
        }

        double countArea(){
            return e * f;
        }

        void incrementE(){
            e++;
        }
    }

