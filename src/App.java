public class App {
    public static void main(String[] args) throws Exception {

        double[][] matriz = new double[10][10];

        System.out.println();
        System.out.println("Valores presentes na matriz 10x10");
        System.out.println(); // quebra de linha

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%.0f ", matriz[i][j]);

            }
            System.out.println();
        }

        // valores que a matriz recebera, usando gerador de numeros para preencher
        System.out.println();
        System.out.println();
        System.out.println("Valores calculados na matriz 10x10");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * Math.pow(i, 2) - 1;
                } else if (i > j) {
                    matriz[i][j] = 4 * Math.pow(i, 3) + 5 * Math.pow(j, 2) + 1;
                }

            }

        }
        System.out.println();

        // imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%.0f ", matriz[i][j]);

            }
            System.out.println(); // quebra de linha
        }

    }

}