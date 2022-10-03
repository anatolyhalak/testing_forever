package ru.stqa.pft.sandbox; //декларация пакета

public class MyFirstProgram { //декларация класса

    public static void main(String[] args) { //void - функция не возвращает никакого значения
        hello("world");
        hello("user");
        hello("Anatoly");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}