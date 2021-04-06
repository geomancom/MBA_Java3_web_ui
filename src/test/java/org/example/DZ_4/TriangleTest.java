package org.example.DZ_4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
        triangle.positive();
        Assertions.assertTrue(triangle.isPositive(), "Треугольник имеет отрицательные стороны");
    }

    @ParameterizedTest
    @DisplayName("Негативная проверка все стороны треугольника должны быть положительными целыми числами")
    @ValueSource(ints = { 0, -5})
    public void isNegativeTest(int Negative){
        triangle = new Triangle(Negative, 4, 5);
        triangle.positive();
        Assertions.assertFalse(triangle.isPositive(), "Треугольник не имеет отрицательные стороны");
    }

    //Вроде все делаю по методичке отрицательная проверка с перебором значений не проходит, прощшу подсказать что ему не нравится.
    // первые две проверки проходят если последнюю убрать.
}
