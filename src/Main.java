public class Main {
    public static void main(String[] args) {
        task8();
        task9();
        task10();
        task11();
        task12();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");

    }


    public static void task9() {
        System.out.println("Задача 9");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            } else
                System.out.println("Установите обычную версию приложения для iOS по ссылке");

        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            } else
                System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int year = 2021;
        if (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");

        }


    }

    public static void task11() {
        System.out.println("Задача 11");
        int deliveryDistance = 42;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 60) {
            days++;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 100) {

            System.out.println("Доставки нет");

        }
    }

    public static void task12() {
        System.out.println("Задача 12");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");


        }
    }

}

