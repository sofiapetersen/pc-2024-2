package ast;
import java.io.PrintWriter;


public class EFloat extends Expressao{
	public float value;
	
	
	public EFloat(float value)
	{
	  this.value = value;
	  
	} 
	@Override
	public void geraCodigo(PrintWriter out, int nivelIndent) {
    	out.print(value);
	}

}