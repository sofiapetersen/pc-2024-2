package ast;
import java.io.PrintWriter;



public class EFalse extends Expressao{
	
	public EFalse()
	{
	  super();
	  
	}

        @Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
    	out.print("false");
	}

}