public class Array5 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        int[] array2 = new int[5];

        System.arraycopy(array1, 0, array2, 0, 5);

        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}
