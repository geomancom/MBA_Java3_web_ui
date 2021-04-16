package org.example.DZ_4;

public class Triangle {
    private int A;
    private int B;
    private int C;
    private boolean isPositive;

    public Triangle(int A, int B, int C){
        if (A > 0 & B > 0 & C > 0) {
            if (A < B+C & B < A+C & C < A+B) {
                this.A = A;
                this.B = B;
                this.C = C;
                this.setPositive(true);
            }else {
                System.out.println(" Сумма двух сторон меньше третей. Треугольник не может быть построен");
            }
        } else {
            System.out.println(" Все стороны треугольника должны быть положительными целыми числами");
        }
    }


    public double SquareTriangle(){
        if (this.isPositive){
            double halfPerimeterTriangle = ( this.A + this.B + this.C)/2.0;
            double squareTriangle = Math.pow((halfPerimeterTriangle*(halfPerimeterTriangle-this.A)*(halfPerimeterTriangle-this.B)*(halfPerimeterTriangle-this.C)),0.5);
            return squareTriangle;
        }else{
            System.out.println("Треугольник не может быть построен");
            return 0;
        }
    }


    public boolean isPositive() {
        return this.isPositive;
    }

    public void setPositive(boolean positive) {
        this.isPositive = positive;
    }


}
