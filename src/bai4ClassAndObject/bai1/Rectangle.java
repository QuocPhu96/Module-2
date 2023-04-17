package bai4ClassAndObject.bai1;

public class Rectangle {


            double width, heigth;

            public Rectangle(){
            }

            public Rectangle(double width,double heigth){
                this.width = width;
                this.heigth = heigth;
            }
            public  double getArea(){
                return this.heigth * this.width;
            }
            public double getPerimeter(){
                return  (this.heigth + this.width) * 2;
            }
            public  String display(){
                return "rectangle{" + " width = "+ width + ", heigth = " + heigth + "}";
            }

    }

