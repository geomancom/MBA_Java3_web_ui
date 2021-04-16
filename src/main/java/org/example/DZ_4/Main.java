package org.example.DZ_4;

public class Main {


    public static void main(String[] args){
        try {
            final Triangle myTriangle = new Triangle(5, 6, 7);
            System.out.println("S = "+myTriangle.SquareTriangle());
        }catch(final IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



    }


}
