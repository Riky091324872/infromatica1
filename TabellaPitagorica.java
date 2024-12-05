public class TabellaPitagorica {
    public static void main(String[] args) {
        int[][] tabella = new int[12][12];

        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella[i].length; j++) {
                tabella[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella[i].length; j++) {
                System.out.printf("%4d", tabella[i][j]);
            }
            System.out.println();
        }
    }
}
