package ru.stqa.geometry.figures;

public class Triangle {
    private double a;
    private double b;
    private double c;

    /*
    Создаем треугольник по трем сторонам
    Проверяем, что треугольник существует
     */
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            //проверяем, что все стороны положительные
            throw new IllegalArgumentException("Стороны должны быть больше 0");
        }
        //Проверяется правило треугольника: сумма любых двух сторон должна быть больше третьей
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Такой треугольник не существует");
        }
        //Если все успешно - сохраняем стороны
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void printTrianglePerimetr(Triangle t) {
        String textPerimeter = String.format("Периметр треугольника со сторонами: + %f + %f + %f = %f", t.a, t.b, t.c, t.trianglePerimeter());
        System.out.println(textPerimeter);
    }

    private Object trianglePerimeter() {

        return null;
    }

}