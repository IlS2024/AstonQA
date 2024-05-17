public class Task10 {
    public static void arr() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 2);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nЗамена");
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else arr[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
