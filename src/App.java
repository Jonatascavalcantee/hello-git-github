import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz com valores de 1 a 16
        int valor = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}