package skypro.java.course1.hw_1;

public class Task_123 {

    public static void main(String[] args) {
        task_1();
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
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return leapYear;
    }

    public static void printIsTheYearALeapYear(int year) {
        boolean trueLeapYear = isTheYearALeapYear(year);
        if (trueLeapYear) {
            System.out.printf("%d — високосный год.\n", year);
        } else {
            System.out.printf("%d — невисокосный год.\n ", year);
        }
    }
}
