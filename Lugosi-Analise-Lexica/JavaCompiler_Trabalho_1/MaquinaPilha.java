import java.io.*;
import java.util.*;

public class MaquinaPilha {
    public static void main(String[] args) {
        // Verifica se o arquivo foi passado como argumento
        if (args.length != 1) {
            System.out.println("Uso: java MaquinaPilha <arquivoDeEntrada>");
            return;
        }

        String arquivoDeEntrada = args[0];
        List<String> instrucoes = new ArrayList<>();
        Stack<Integer> pilha = new Stack<>();

        // Lê as instruções do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoDeEntrada))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                instrucoes.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Processa as instruções
        try {
            for (String instrucao : instrucoes) {
                String[] partes = instrucao.split(" ");
                switch (partes[0].toUpperCase()) {
                    case "PUSH":
                        if (partes.length != 2) throw new IllegalArgumentException("PUSH requer um argumento");
                        pilha.push(Integer.parseInt(partes[1]));
                        break;
                    case "POP":
                        if (pilha.isEmpty()) throw new EmptyStackException();
                        pilha.pop();
                        break;
                    case "SUM":
                        if (pilha.size() < 2) throw new IllegalStateException("ADD requer ao menos dois valores na pilha");
                        pilha.push(pilha.pop() + pilha.pop());
                        break;
                    case "SUB":
                        if (pilha.size() < 2) throw new IllegalStateException("SUB requer ao menos dois valores na pilha");
                        int subtrator = pilha.pop();
                        pilha.push(pilha.pop() - subtrator);
                        break;
                    case "MULT":
                        if (pilha.size() < 2) throw new IllegalStateException("MUL requer ao menos dois valores na pilha");
                        pilha.push(pilha.pop() * pilha.pop());
                        break;
                    case "DIV":
                        if (pilha.size() < 2) throw new IllegalStateException("DIV requer ao menos dois valores na pilha");
                        int divisor = pilha.pop();
                        if (divisor == 0) throw new ArithmeticException("Divisão por zero");
                        pilha.push(pilha.pop() / divisor);
                        break;
                    case "PRINT":
                        if (pilha.isEmpty()) throw new EmptyStackException();
                        System.out.println(pilha.peek());
                        break;
                    default:
                        throw new UnsupportedOperationException("Instrução desconhecida: " + partes[0]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro durante a execução: " + e.getMessage());
        }
    }
}
