package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    //Тест проверяет периметр прямоугольного треугольника 3-4-5
    //Ожидаемый результат: 3 + 4 + 5 = 12
    @Test
    void canCalculatePerimeterForRightTriangle() {
        Triangle t = new Triangle(3, 4, 5);
        Assertions.assertEquals(12.0, t.trianglePerimeter());
    }

    //Тест проверяет площадь прямоугольного треугольника 3-4-5
    //Из геометрии: S=1/2 * катет * катет = 1/2 * 3 * 4 = 6
    @Test
    void canCalculateAreaForRightTriangle(){
        Triangle t = new Triangle(3, 4, 5);
        Assertions.assertEquals(6.0, t.triangleArea());
    }

    //Тест для равностороннего треугольника со сторонами: 2, 2, 2.
    //Периметр: 6
    //Площадь: sqrt(3) = 1.732
    @Test
    void canCalculatePerimeterAndAreaForEquilateralTriangle(){
        Triangle t = new Triangle(2, 2, 2);
        //Проверка периметра
        Assertions.assertEquals(6.0, t.trianglePerimeter());
        //Проверка площади
        Assertions.assertEquals(Math.sqrt(3.0), t.triangleArea());
    }

    //Тест для равнобедренного треугольника 5, 5, 6
    //Периметр: 16
    //Площадь по Герону: 12
    @Test
    void canCalculatePerimeterAndAreaForIsoscelesTriangle(){
        Triangle t = new Triangle(5, 5, 6);
        //Проверка периметра
        Assertions.assertEquals(16.0, t.trianglePerimeter());
        //Проверка площади
        Assertions.assertEquals(12.0, t.triangleArea());
    }
}
