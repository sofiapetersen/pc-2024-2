import java.io.*;
import java.util.*;

public class MaquinaPilha {
    public static void main(String[] args) {

        String arquivoDeEntrada = args[0];
        List<String> instrucoes = new ArrayList<>();
        Stack<Integer> pilha = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoDeEntrada))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                instrucoes.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        try {
            for (String instrucao : instrucoes) {
                String[] partes = instrucao.split(" ");
                switch (partes[0].toUpperCase()) {
                    case "PUSH":
                        pilha.push(Integer.parseInt(partes[1]));
                        break;
                    case "POP":
                        pilha.pop();
                        break;
                    case "ADD":
                        pilha.push(pilha.pop() + pilha.pop());
                        break;
                    case "SUB":
                        int subtrator = pilha.pop();
                        pilha.push(pilha.pop() - subtrator);
                        break;
                    case "MUL":
                        pilha.push(pilha.pop() * pilha.pop());
                        break;
                    case "DIV":
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
