package ast;
import java.io.PrintWriter;



public class ETrue extends Expressao{
	
	public ETrue()
	{
	  super();
	  
	}

        @Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
    	out.print("true");
	}

}