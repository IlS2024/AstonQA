public class Task3 {
    public static void printColor(){
        int value = (int) (Math.random()*(300+1)) - 100;
        System.out.println("value = " + value);
        if (value <= 0)
            System.out.println("Красный");
        else if (value <= 100)
            System.out.println("Жёлтый");
            else
                System.out.println("Зелёный");
    }
}
