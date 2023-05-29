import javax.lang.model.util.ElementScanner6;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Задание) Напишите программу, чтобы проверить значения длины и ширины прямоугольника и
        // определить, является ли он квадратным или нет.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение длины прямоугольника: ");
        int length = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите значение ширины прямоугольника: ");
        int width = scanner1.nextInt();

        if (length == width) {
            System.out.println("Прямоугольник является квадратным");
        } else {
            System.out.println("Прямоугольник не является квадратным");
        }
//
//        // 2. Задание) Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
//        // Если стоимость товара ниже 5000, то стоимость остается без изменений.
//        // Вычислите и выведите итоговую стоимость покупки для пользователя.
//
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        int number = scanner.nextInt();


        if (number >= 5000) {
            System.out.println("Вы получили скидку в 10%");
            System.out.println("Итоговая сумма со скидкой равна: " + (number * 1.1));
        } else {
            System.out.println("Вы не получили скидку в 10%");
            System.out.println("Итоговая сумма равна: " + (number));
        }
//
//        // 3. Задание) В университете существуют следующие правила для системы оценок:
//        //
//        //Ниже 25 - F
//        //От 25 до 45 - E
//        //От 45 до 50 - D
//        //От 50 до 60 - C
//        //От 60 до 80 - B
//        //Выше 80 - A
//        //Создайте переменную grade и напечатайте в консоль соответствующую оценку
//        // в зависимости от значения переменной.
//
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите свой балл: ");
        int grade = scanner4.nextInt();

        if (grade >= 0 && grade < 25) {
            System.out.println("Ваша оценка - F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Ваша оценка - E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Ваша оценка - D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Ваша оценка - C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Ваша оценка - B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("Ваша оценка - A");
        } else
            System.out.println("Неверное число");
//
//        // 5. Задание) Дано целое положительное число.
//        // Напишите программу, которая выводит сообщение о том, является ли это число простым.
//
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int positiveNumber = scanner5.nextInt();
        if (positiveNumber >= 0) {
            System.out.println("Данное число положительное");
        } else {
            System.out.println("Данное число отрицательное");
        }
//
//        // 6. Задание) Напишите программу для печати следующего сообщения:
//        //
//        //i)
//        //**********
//        //**********
//        //**********
//        //**********
//
//        for (int i = 0; i < 4; i++ ) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        //
//        //ii)
//        //*
//        //**
//        //***
//        //****
//        //*****
//        //
//
//        for (int ii = 1; ii < 6; ii++) {
//            for (int jj = 1; jj <= ii; jj++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //iii)
//        //        1
//        //      212
//        //    32123
//        //  4321234
//        //543212345
//
//        int rows = 5;
//
//        for (int iii = 1; iii <= rows; iii++) {
//            for (int jjj = 1; jjj <= rows - iii; jjj++) {
//                System.out.print(" ");
//            }
//            for (int jjj = iii; jjj >= 1; jjj--) {
//                System.out.print(jjj);
//            }
//            for (int jjj = 2; jjj <= iii; jjj++) {
//                System.out.print(jjj);
//            }
//
//            System.out.println();
//        }

        // 7. Задание) Даны два целых числа a и b. Напишите программу для вычисления суммы
        // натуральных чисел в диапазоне от a до b.


        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner6.nextInt();

        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int b = scanner7.nextInt();

        int sum = 0;

        for (int i1 = a; i1 <= b; i1++) {
            sum += i1;
        }
        System.out.println("Сумма двух натуральных чисел равно: " + (a + b));


        // 8. Задание) В компании прошла аттестация по компетенциям и навыкам сотрудников.
        // Даны зарплата и класс сотрудника. Напишите программу, чтобы определить сумму премии
        // в зависимости от класса сотрудника. Необходимо создать переменную со значением зарплаты сотрудника,
        // вывести в консоль результирующую зарплату с премией.
        //
        //Бонусы в зависимости от класса:
        //
        //Класс A: 50%
        //Класс B: 25%
        //Класс C: 0%

        Scanner scanner8 = new Scanner(System.in);
        System.out.print("Введите зарплату сотрудника: ");
        double salary = scanner8.nextInt();

        Scanner scanner9 = new Scanner(System.in);
        System.out.print("Введите класс сотрудника: ");
        String grade1 = scanner9.next();

        double bonus = 0;

        switch (grade1) {
            case "A":
                bonus = 0.5 * salary;
                break;
            case "B":
                bonus = 0.25 * salary;
                break;
            case "C":
                bonus = 0;
                break;
            default:
                System.out.println("Некорректный класс сотрудника.");
                return;
        }

        double totalSalary = salary + bonus;
        System.out.println("Зарплата сотрудника с бонусом составляет: " + totalSalary);

        // 9. Задание) Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:
        //0 1 1 2 3 5 8 13 21 .....

        int fibonacci = 1;
        while (fibonacci != 0) {
            fibonacci = fibonacci + fibonacci;

            System.out.println(fibonacci);
        }

    }
}