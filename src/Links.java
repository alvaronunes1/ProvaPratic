import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Links {

    public static void main(String[] args) {

        Deque<String> linhas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o link que você quer remover");
        String ler = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\12116455\\IdeaProjects\\ProvaPratica\\Lista_URL.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Todos os sites");
        for (String linha : linhas) {
            System.out.println(linha);
        }

        System.out.println();
        System.out.println("---------------//-----------");
        System.out.println();


        if(linhas.contains(ler)){
            System.out.println("O link " + ler + "foi removido com sucesso" );
            linhas.remove(ler);
        } else {
            System.out.println("Link não encontrado");
        }

        for (String linha: linhas) {
            System.out.println(linha);
        }
    }
}


