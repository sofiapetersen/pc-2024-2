package ast;
import java.io.PrintWriter;

public class EVar extends Expressao {
	public String var;
	
	public EVar(String var)
	{
	  this.var = var;
	  
	}

        @Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
    	out.print(var);
	}

}