package ru.stqa.pft.sanbox;

import javax.print.DocFlavor;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");

    Square s = new Square(5);
    System.out.println("Плозадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    double x1 = 5;
    double x2 = 2;
    double y1 = 7;
    double y2 = 3;
    System.out.println("Расстояние между точками с р1 и р2 = " + distance(x1, x2, y1, y2));
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }
  public static double distance(double x1, double x2, double y1, double y2){

    double p1 = (x1 - x2) * (x1 - x2);
    double p2 = (y1 - y2) * (y1 - y2);
    double sqrt = Math.sqrt(p1 + p2);
    return sqrt;
  }
}
