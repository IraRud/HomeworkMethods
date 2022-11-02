package skypro.java.course1.hw_1;

import java.time.LocalDate;

public class Task_123 {

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
    }

    /*Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит
    результат в консоль. Високосным является каждый четвертый год, но не является каждый сотый. Также високосным является
    каждый четырехсотый год.
    Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
    Результат программы выведите в консоль. Если год високосный, то должно быть выведено “номер года — високосный год”.
    Если год не високосный, то, соответственно: “номер года — не високосный год”.*/
    public static void task_1() {
        System.out.println("Задание 1.");
        int year = 500;
        printIsTheYearALeapYear(year);
    }

    public static boolean isTheYearALeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void printIsTheYearALeapYear(int year) {
        boolean leapYear = isTheYearALeapYear(year);
        if (leapYear) {
            System.out.printf("%d — високосный год.\n", year);
        } else {
            System.out.printf("%d — невисокосный год.\n ", year);
        }
    }

    /* Необходимо было предложить пользователю облегченную версию приложения.
    Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и год выпуска 
    устройства.
    Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
    В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения (обычную
    или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
    */
    public static void task_2() {
        System.out.println("\nЗадание 2.");
        int currentYear = LocalDate.now().getYear();
        byte clientOS = 1; // 0 — iOS, 1 — Android
        getRightVersionOfApp(currentYear, clientOS);
    }

    public static void getRightVersionOfApp(int year, byte OS) {
        switch (OS) {
            case 0:
                if (year >= 2015) {
                    System.out.println("Установите приложение для iOS по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (year >= 2015) {
                    System.out.println("Установите приложение для Android по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }
                break;
            default:
                System.out.println("Для Вашей ОС не предусмотрено мобильное приложение.");
        }
    }

    /* Рассчитайте дни доставки банковской карты от банка.
    Доставка в пределах 20 км занимает сутки.
    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        deliveryDistance <= 20 -> 1 день
        20 < deliveryDistance < 60 -> 2 дня
        60 <= deliveryDistance < 100 -> 3 дня
        100 <= deliveryDistance < 140 -> 4 дня
        и т.д.
    Написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.*/
    public static void task_3() {
        System.out.println("\nЗадание 3.");
        int deliveryDistance = 100;
        printTheDeliveryTime(deliveryDistance);
    }

    public static int findTheDeliveryTime (int distance) {
        int time;
        if (distance <= 20) {
            time = 1;
        } else {
            time = (distance - 20) / 40 + 2;
        }
        return time;
    }

    public static void printTheDeliveryTime(int distance) {
        int deliveryTime = findTheDeliveryTime(distance);
        System.out.printf("При дистанции %d км доставка займет дней: %d.", distance, deliveryTime);
    }

}
