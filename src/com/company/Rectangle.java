package com.company;

public class Rectangle {
    // поля класса
    double x;
    double y;
    private static int createdRectangles = 0;
    private static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private static final String ENGLISH_CLASS_NAME = "Rectangle";

    // конструктор 1
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }
    // конструктор 2
    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }
    // метод calculateArea
    double calculateArea() {
        double S = x * y;
        return S;
    }
    // метод printArea
    void printArea(double S) {
        System.out.println(S);
    }
    // метод printRectangleKind
    void printRectangleKind() {
        if(x == y) {
            System.out.println("Это квадрат");
        } else {System.out.println("Это прямоугольник");}
    }
    // метод isTheSameRectangle
    boolean isTheSameRectangle(Rectangle rectangle) {
        return this.x == rectangle.x &&
                this.y == rectangle.y;
    }
    //метод printRectanglesCount
    static void printRectanglesCount () {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }
    //метод printClassName
    static void printClassName (boolean printInRussian) {
        if (printInRussian){
            System.out.println(RUSSIAN_CLASS_NAME);
        }else{
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }


}