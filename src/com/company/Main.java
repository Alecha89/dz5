package com.company;

public class Main {

    public static void main(String[] args) {
        //-------Прямоугольник
        Rectangle rect1 = new Rectangle(2, 3);
        double S1 = rect1.calculateArea();
        rect1.printArea(S1);
        rect1.printRectangleKind();
        boolean res1 = rect1.isTheSameRectangle(rect1);
        System.out.println(res1);
        System.out.println("------------------------------");
        //-------Квадрат
        Rectangle rect2 = new Rectangle(2);
        double S2 = rect2.calculateArea();
        rect2.printArea(S2);
        rect2.printRectangleKind();
        boolean res2 = rect2.isTheSameRectangle(rect1);
        System.out.println(res2);
        System.out.println("------------------------------");
        //-------Прямоугольник
        Rectangle rect3 = new Rectangle(5, 10);
        double S3 = rect3.calculateArea();
        rect3.printArea(S3);
        rect3.printRectangleKind();
        boolean res3 = rect3.isTheSameRectangle(rect3);
        System.out.println(res3);
        System.out.println("------------------------------");

        rect3.printRectanglesCount();
        rect3.printClassName(res3);


    }
}