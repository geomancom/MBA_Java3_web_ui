package org.example.DZ_4;

public class Triangle {
    private final int A;
    private final int B;
    private final int C;
    private boolean isPositive;

    public Triangle(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void positive() {
        if (this.A > 0 && this.B > 0 && this.C > 0) {
            System.out.println(" Все стороны треугольника  положительные");
            this.setPositive(true);
        } else {
            System.out.println(" Все стороны треугольника должны быть положительными целыми числами");
            this.setPositive(false);
        }

    }

    public void SquareTriangle(){
        double halfPerimeterTriangle = ( this.A + this.B + this.C)/2.0;
        double squareTriangle = Math.pow((halfPerimeterTriangle*(halfPerimeterTriangle-this.A)*(halfPerimeterTriangle-this.B)*(halfPerimeterTriangle-this.C)),0.5);
        System.out.println("S = "+squareTriangle);
    }


    public boolean isPositive() {
        return this.isPositive;
    }

    public void setPositive(boolean positive) {
        this.isPositive = positive;
    }


}
