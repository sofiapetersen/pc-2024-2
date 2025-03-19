package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CIf extends Comando{
	public int linha;
	public Expressao exp;
	public ArrayList<Comando> bloco;
	
	public CIf(int linha, Expressao exp, ArrayList<Comando> bloco)
	{
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	} 

	@Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
		String indentacao = "    ".repeat(nivelIndent);
		out.print(indentacao + "if ");
		
		exp.geraCodigo(out, 0);

		out.println(" {");
	
		for (Comando comando : bloco) {
			comando.geraCodigo(out, nivelIndent + 2);
		}
			
		out.print("    ");
		out.print("}");
		out.println();
	}
}