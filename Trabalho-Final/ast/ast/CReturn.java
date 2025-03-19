package ast;
import java.io.PrintWriter;

public class CReturn extends Comando {
    public int linha;
    public Expressao exp;

    public CReturn(int linha, Expressao exp) {
        this.linha = linha;
        this.exp = exp;
    }

    @Override
    public void geraCodigo(PrintWriter out, int nivelIndent) {
		String indentacao = "    ".repeat(nivelIndent);
        out.print(indentacao + "return ");
        if (exp != null) {
            exp.geraCodigo(out, nivelIndent + 1);
        }
        out.println(";");
    }
}
