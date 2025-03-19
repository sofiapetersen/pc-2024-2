package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}

	public void geraCodigo(PrintWriter out, int nivelIndent) {
        String indentacao = "    ".repeat(nivelIndent);
    
        if (vars != null) {
            for (VarDecl var : vars) {
                out.print(indentacao); // Adiciona indentação antes de cada variável
                var.geraCodigo(out, nivelIndent);
            }
        }
        if (coms != null) {
            for (Comando comando : coms) {
                out.print(indentacao); // Adiciona indentação antes de cada comando
                comando.geraCodigo(out, nivelIndent);
            }
        }
    }
    

}
