package exception;

public class Second {

    public static void main(String[] args) {
        System.out.println("Сценарий с исключением:");

        try {
            divideOneBy(0);
        }  catch (ArithmeticException e) {
            System.out.println("Поймано исключение при делении на ноль: " + e.getMessage());
        }

        try {
            getRoot(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано ислючение неверного аргемента: " + e.getMessage());
        }

        try {
            getRoot("Hi, mom!");
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано ислючение неверного аргемента: " + e.getMessage());
        }

        System.out.println("Сценарий без исключений:");

        try {
            divideOneBy(10);
        }  catch (ArithmeticException e) {
            System.out.println("Поймано исключение при делении на ноль: " + e.getMessage());
        }

        try {
            getRoot(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано ислючение неверного аргемента: " + e.getMessage());
        }

        try {
            getRoot("Hello, world!");
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано ислючение неверного аргемента: " + e.getMessage());
        }
    }

    public static double divideOneBy(double number) {
        return 1.0 / number;
    }

    public static void getRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Значение должно быть положительным!");
        }

        return Math.sqrt(number);
    }

    public static void checkStringLength(String text) {
        if (text.length() < 10) {
            throw new IllegalArgumentException("Длина строки должна быть не менее 10 символов!");
        } else {
            System.out.println("Достаточная длина строки: " + text);
        }
    }
}
