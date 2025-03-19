package ast;
import java.io.PrintWriter;

public class CAtribuicao extends Comando{
	public int linha;
	public String var;
	public Expressao exp;
	
	public CAtribuicao(int linha,String var, Expressao exp)
	{
	  this.linha = linha;	
	  this.var = var;
	  this.exp = exp;
	} 

    @Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
    out.print(var + " = ");
    exp.geraCodigo(out, nivelIndent);
    out.println(";");
}

}