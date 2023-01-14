package ru.sergileon.java;

import java.io.IOException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {
//        //это числовые типы
//        byte a;
//        short b;
//        int c;
//        long d;
//
//        // логический тип
//        boolean e;
//
//        //вещественные типы данных
//        float f;
//        double g;
//
//        //символьный тип данных
//        char ch;

//        int firstNumber = 2;
//        int secondNumber = 3;
//        int summa = firstNumber + secondNumber;
//        System.out.println(summa);

//        int thisIsInt = 1000 * 1000 * 1000 * 1000;
//        long thisIsLong = 1000 * 1000 * 1000 * 1000 * 1000;
//        System.out.println(thisIsInt);
//        System.out.println(thisIsLong);

//        boolean first = true;
//        boolean second = false;
//
//        System.out.println(first);
//        System.out.println(second);

//        char c = 0x2744;
//        char c2 = 'B';
//        System.out.println(System.currentTimeMillis());

//        int a = 1;
//        Integer aa = 1;
//        Integer bb = 2;
//
//        System.out.println(aa.compareTo(bb));


//        String s = "Hello world!";
//
//        System.out.println(s);

//        String hello = "Hello";
//        String world = "World";
//
//        System.out.println(hello + " " + world);

//        System.out.println("Hello world!");

        // TODO: Как посмотреть?
//        String s = "Hello world";
//
////        String t = s.toUpperCase();
//        String t = s.substring(4);
//        Boolean b = s.contains("hello");

//        System.out.println(b);

//        Scanner in = new Scanner(System.in);
//
//        Integer a = in.nextInt();
//        Integer b = in.nextInt();

//        System.out.println(a + b);

//        if () {
//
//        }

//        Scanner in = new Scanner(System.in);
//
//        Integer a = in.nextInt();
//        Integer b = in.nextInt();
//
//        if (a == b) {
//            System.out.println(a + b);
//        } else {
//            System.out.println(a * b);
//        }
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваш пол:");
//        String s = in.next();
//
//        if (s)

//        Integer firstNumber = 1000;
//        Integer b = 1000;
//
//        if (firstNumber.equals(b) == true ) {
//            System.out.println("Числа равны");
//        } else {
//            System.out.println("Нихуя не равны");
//        }


//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваш пол:");
//        String s = in.next();
//
//        if (s.equals("Мужик")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("мужик")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("Мужчина")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("мужчина")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("Мужичок")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("мужичок")) {
//            System.out.println("Вы мужчина");
//        } else if (s.equals("мальчик")) {
//            System.out.println("Вы мужчина");
//        } else {
//            System.out.println("Вы не мужчина");
//        }

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваш пол:");
//        String s = in.next();
//        String lowerS = s.toLowerCase();
//        char c = lowerS.charAt(0);
//
//        if (c == 'м') {
//            System.out.println("Вы мужчина");
//        } else {
//            System.out.println("Вы не мужчина");
//        }


//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваш пол:");
//        String s = in.next();
//
//        if (s.toLowerCase().charAt(0) == 'м') {
//            System.out.println("Вы мужчина");
//        } else {
//            System.out.println("Вы не мужчина");
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        Integer a = in.nextInt();
//
//        System.out.println("Введите математический знак");
//        String s = in.next();
//
//        System.out.println("Введите второе число");
//        Integer b = in.nextInt();
//        System.out.print(a + s + b + "=");

        //TODO: тут писать код


//        if (условие) {
//            //действия
//            //действия
//            //действия
//            //действия
//            //действия
//            //действия
//        }

//        Scanner in = new Scanner(System.in);

//        System.out.print("Введи страну проживания: ");
//        String country = in.next();
//
//        System.out.print("Введи город проживания: ");
//        String city = in.next();
//
//
//        if (country.equals("Россия") && city.equals("Санкт-Петербург")) {
//            System.out.println("Вы живете в городе на Неве");
//        } else {
//
//            System.out.println("Вы живете не в Питере");
//
//        }


//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Ваш пол: ");
//        String sex = in.next();
//
////        if (age >= 18 && sex.equals("ж")) {
////            System.out.println("Вход разрешён");
////        } else if (age >= 21 && sex.equals("м")) {
////            System.out.println("Вход разрешён");
////        } else {
////            System.out.println("Иди к мамочке");
////        }
//
//        if ( (age >= 18 && sex.equals("ж")) || (age >= 21 && sex.equals("м")) ) {
//            System.out.println("Вход разрешён");
//        } else {
//            System.out.println("Иди к мамочке");
//        }

        int a = 10;
        int b = 15;
        int c = 22;
        int max3 = Math.max(a, Math.max(b, c));
        int min3 = Math.min(a, Math.min(b, c));

        System.out.println(max3);
        System.out.println(min3);
        System.out.println(a + b + c - max3 - min3);


    }

}
