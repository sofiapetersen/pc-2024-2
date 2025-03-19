package ast;
import java.io.PrintWriter;

public class CPrint extends Comando {
    public int linha;
    public Expressao exp;

    public CPrint(int linha, Expressao exp) {
        this.linha = linha;
        this.exp = exp;
    }

    @Override
    public void geraCodigo(PrintWriter out, int nivelIndent) {
        out.print("printf(\"%f\\n\", ");
        exp.geraCodigo(out, 0);
        out.println(");");
    }
}
