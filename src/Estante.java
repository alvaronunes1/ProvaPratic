import java.util.Scanner;

public class Estante {
    public static void main(String[] args) {
        int[][] estante = new int[40][40];
        String[] produto = {"vazio", "xampu", "condicionador", "hidratante", "tintura", "demaquilante"};
        int[] contador = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Considere os seguintes produtos e seus códigos: ");
        System.out.println("1: xampu;");
        System.out.println("2: condicionador;");
        System.out.println("3: hidratante;");
        System.out.println("4: tintura;");
        System.out.println("5: demaquilante;");
        System.out.println("0: vazio");
        System.out.printf("Adicione %d produtos na estante informando seu código\n", 40 * 40);

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print("Forneça código: ");
                int codigo = scanner.nextInt();
                if (codigo > 5 || codigo < 0) {
                    System.out.println("ATENÇÃO: Código de produto inválido");
                    j--;
                } else {
                    estante[i][j] = codigo;
                }
            }
        }

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                contador[estante[i][j]]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Produto %s possui %d caixas na estante.\n", produto[i], contador[i]);
        }
    }
}
