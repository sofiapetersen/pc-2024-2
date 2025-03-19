package ast;
import java.io.PrintWriter;

public class EOpExp extends Expressao{
	public String op;
	public Expressao arg1;
	public Expressao arg2;
	
	
	public EOpExp(String op, Expressao arg1, Expressao arg2)
	{
	  this.op = op;
	  this.arg1 = arg1;
	  this.arg2 = arg2;
	  
	}

        @Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
		out.print( "(");
		arg1.geraCodigo(out, nivelIndent);
		out.print(" " + op + " ");
		arg2.geraCodigo(out, nivelIndent);
		out.print(")");
	}

}
