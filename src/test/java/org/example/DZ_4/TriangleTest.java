package org.example.DZ_4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TriangleTest {
    Triangle triangle;

    @Test
    @DisplayName("Создание треугольника")
    public void canBeInitializedTest() {
        triangle = new Triangle(3, 4, 5);
    }



    @Test
    @DisplayName("Позитивная проверка")
    public void isPositiveTest(){
        triangle = new Triangle(5, 4, 5);
        Assertions.assertTrue(triangle.isPositive(), "Треугольник имеет отрицательные стороны");
    }

    @ParameterizedTest
    @DisplayName("Негативная проверка все стороны треугольника должны быть положительными целыми числами")
    @ValueSource(ints = { 0, -5, 1000})
    public void isNegativeTest(int Negative){
        triangle = new Triangle(Negative, 4, 5);
        Assertions.assertFalse(triangle.isPositive(), "Треугольник может быть построен по данным значениям сторон");
    }

    @Test
    @DisplayName("Позитивная S проверка")
    public void squareTrianglePositiveTest(){
        triangle = new Triangle(5, 4, 5);
        Assertions.assertTrue(triangle.SquareTriangle() > 0, "Треугольник имеет отрицательные стороны");
    }

    @ParameterizedTest
    @DisplayName("Негативная проверка S треугольника")
    @ValueSource(ints = { 0, -5, 1000})
    public void squareTriangleNegativeTest(int Negative){
        triangle = new Triangle(Negative, 4, 5);
        Assertions.assertFalse(triangle.SquareTriangle() < 0, "Треугольник не может быть построен по данным значениям сторон");
    }
}
