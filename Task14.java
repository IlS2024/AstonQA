import java.util.Arrays;

public class Task14 {
    public static  int[] arr(int len, int initialValue){
        int array[] = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
