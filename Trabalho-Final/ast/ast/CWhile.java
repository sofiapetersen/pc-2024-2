package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CWhile extends Comando {
    public int linha;
    public Expressao exp;
    public ArrayList<Comando> bloco;

    public CWhile(int linha, Expressao exp, ArrayList<Comando> bloco) {
        this.linha = linha;
        this.exp = exp;
        this.bloco = bloco;
    }

	@Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
		String indentacao = "    ".repeat(nivelIndent);
		out.print("while");
		
		exp.geraCodigo(out, 0); 


		out.println(" {"); 
		for (Comando comando : bloco) {
			out.print("\t\t");
			comando.geraCodigo(out, nivelIndent + 1);
		}
		
		out.println(indentacao + "}");
	}
}