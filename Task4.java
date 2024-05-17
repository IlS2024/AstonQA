public class Task4 {
    public static void compareNumbers (){
        int a = (int) (Math.random()*(200+1)) - 100;
        int b = (int) (Math.random()*(200+1)) - 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a >= b)
            System.out.println("a >= b");
            else
            System.out.println("a < b");
    }
}
