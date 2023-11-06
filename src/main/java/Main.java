public class Main {
    public static void main(String[] args) {
        int x = 85;
        int y = 12;
        int max = Integer.MAX_VALUE;
        double b = 12.8;

        //Математические операции
        System.out.println("Сложение: " + (x+y));
        System.out.println("Вычитание: " + (x-y));
        System.out.println("Умножение: " + (x*y));
        System.out.println("Деление: " + (x/y));
        System.out.println("Остаток от деления: " + (x%y));

        //Логические операции
        if (x > y) {
            System.out.println(x + " больше " + y);
        } else if (x < y) {
            System.out.println(x + " меньше " + y);
        } else if (x == y) {
            System.out.println(x + " равно " + y);
        } else if (x >= y) {
            System.out.println(x + " больше или равно " + y);
        } else if (x <= y) {
            System.out.println(x + " меньше или равно " + y);
        }

        //Переполнение
        System.out.println("Переполнение: " + (max+x));

        //Вычисления типов данных int и double
        System.out.println("Сложение: " + (x+b));
        System.out.println("Вычитание: " + (x-b));
        System.out.println("Умножение: " + (x*b));
        System.out.println("Деление: " + (x/b));
        System.out.println("Остаток от деления: " + (x%b));
    }
}