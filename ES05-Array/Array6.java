import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] array = new int[5];
        
        Arrays.fill(array, 3);

        array[0] = 8;
        array[1] = 3;
        array[2] = 6;
        array[3] = 1;
        array[4] = 9;

        Arrays.sort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
