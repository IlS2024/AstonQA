import java.util.Arrays;

public class Task12 {
    public static void arr(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
    }
}
