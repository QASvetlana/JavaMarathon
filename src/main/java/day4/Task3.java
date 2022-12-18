package day4;


public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        int maxString = 0;
        int maxStringId = 0;

        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                matrice[i][j] = (int) (Math.random() * 50);
                sum += matrice[i][j];
                System.out.print(matrice[i][j] + " ");
            }

            if (sum >= maxString) {
                maxString = sum;
                maxStringId = i;
            }
            System.out.println(" = "+sum+"\n");
        }
        System.out.println(maxStringId);

    }
}
