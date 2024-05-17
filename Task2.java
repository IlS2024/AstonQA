public class Task2 {
    public static void checkSumSign(){
        int a = (int) (Math.random()*(200+1)) - 100;
        int b = (int) (Math.random()*(200+1)) - 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a+b >= 0)
            System.out.printf("Сумма положительная");
        else
            System.out.printf("Сумма отрицательная");
    }
}
