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

    Point d = new Point(5, 2, 7, 3);
    System.out.println("Расстояние между точками с р1 и р2 = " + d.distance());
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }
}
