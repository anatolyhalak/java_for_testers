package ru.stqa.geometry.figures;

public class Triangle {
    double a;
    double b;
    double c;

    /*
    Создаем треугольник по трем сторонам
    Проверяем, что треугольник существует
     */
    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            //проверяем, что все стороны положительные
            throw new IllegalArgumentException("Стороны должны быть больше 0");
        } else {
            //Проверяется правило треугольника: сумма любых двух сторон должна быть больше третьей
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Такой треугольник не существует");
            }
        }

        //Если все успешно - сохраняем стороны
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void printTrianglePerimetr(Triangle t) {
        String textPerimeter = String.format("Периметр треугольника со сторонами: %.1f, %.1f и %.1f = %.1f", t.a, t.b, t.c, t.trianglePerimeter());
        System.out.println(textPerimeter);
    }

    public static void printTriangleArea(Triangle t) {
        String textArea = String.format("Площадь треугольника со сторонами: %.1f, %.1f и %.1f = %.2f", t.a, t.b, t.c, t.triangleArea());
        System.out.println(textArea);
    }

    public double trianglePerimeter() {
        return this.a + this.b + this.c;
    }

    public double triangleArea() {
        double p = trianglePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}