public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        for (int year = 1904; year <= 2096; year+=4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println( "Задание 2");
        for (int i = 7; i <= 98 ; i+=7) {
            System.out.print(" " + i);
            
        }
        System.out.println();

        System.out.println("Задание 3");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
            
        }

    }
}