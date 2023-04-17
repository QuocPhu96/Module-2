package bai4ClassAndObject.bai2;

public class QuadraticEquation {
        double a, b, c, delta;
        double x1, x2;

        public QuadraticEquation(){
        }
        public  QuadraticEquation(double a,double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getDental(){
            return this.delta = (this.b * this.b) - (4 * this.a * this.c);
        }
        public String getRoot(){
            if (delta == 0){
                return "phương trình có 1 nghiệm = " + getRoot2();
            }
            else if(delta > 0){
                return  "Phương trình có 2 nghiệm X1 = " + getRoot1() + " X2 = " + getRoot2();
            }
            else
                return "Phương Trình vô nghiêm";
        }
        public double getRoot1 (){
                return x1 = (-b + Math.sqrt(delta)) / (2 * a);

        }
        public  double getRoot2 (){
                return x2 = (-b - Math.sqrt(delta)) / (2 * a);

        }


}
