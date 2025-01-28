import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] array1 = {4, 8, 15, 16};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        if (Arrays.equals(array1, array2)) {
            System.out.println("I due array sono identici.");
        } else {
            System.out.println("I due array non sono identici.");
        }
    }
}
