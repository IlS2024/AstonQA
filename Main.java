import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Выбери задание 1-14\n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Выбрано " + number);
        switch (number) {
            case 1:
                Task1.printThreeWords();
                break;
            case 2:
                Task2.checkSumSign();
                break;
            case 3:
                Task3.printColor();
                break;
            case 4:
                Task4.compareNumbers();
                break;
            case 5:
                System.out.println("Введите число a");
                int a = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите число b");
                int b = scanner.nextInt();
                scanner.nextLine();
                Task5.summ(a,b);
                break;
            case 6:
                int zn = (int) (Math.random()*(200+1)) - 100;
                System.out.println("Значение числа = " + zn);
                Task6.znak(zn);
                break;
            case 7:
                System.out.println("Введите целое число");
                int a7 = scanner.nextInt();
                scanner.nextLine();
                Task7.torf(a7);
                break;
            case 8:
                System.out.println("Введите число");
                int a8 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Введите строку");
                String str8 = scanner.nextLine();
                Task8.txt(str8,a8);
                break;
            case 9:
                System.out.println("Введите год");
                int year = scanner.nextInt();
                scanner.nextLine();
                System.out.println(Task9.year(year));
                break;
            case 10:
                Task10.arr();
                break;
            case 11:
                Task11.arr();
                break;
            case 12:
                Task12.arr();
                break;
            case 13:
                Task13.darr();
                break;
            case 14:
                System.out.println("Длина массива");
                int len = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Значение ячейки");
                int initialValue = scanner.nextInt();
                scanner.nextLine();
                Task14.arr(len,initialValue);
                break;
        }
    }
}