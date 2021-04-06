package org.example.DZ_4;

public class Main {


    public static void main(String[] args){
        Triangle myTriangle = new Triangle(5, 6, 7);
        myTriangle.positive();
        if (myTriangle.isPositive()){
            System.out.println("This triangle is good");
            myTriangle.SquareTriangle();
        }else{
            System.out.println("This triangle is not good");
        }




    }


}
