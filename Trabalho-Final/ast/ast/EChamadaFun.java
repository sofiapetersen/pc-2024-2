package ast;

import java.io.PrintWriter;
import java.util.ArrayList;

public class EChamadaFun extends Expressao {
    private final String nome;
    private final ArrayList<Expressao> argumentos;

    public EChamadaFun(String nome, ArrayList<Expressao> argumentos) {
        this.nome = nome;
        this.argumentos = argumentos;
    }

    @Override
    public void geraCodigo(PrintWriter out, int nivelIndent) {
        out.print(nome + "(");
        for (int i = 0; i < argumentos.size(); i++) {
            argumentos.get(i).geraCodigo(out, nivelIndent + 1);
            if (i < argumentos.size() - 1) {
                out.print(", ");
            }
        }
        out.print(")");
    }
}
