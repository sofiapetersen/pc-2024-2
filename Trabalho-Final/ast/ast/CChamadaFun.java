package ast;
import java.util.ArrayList;

public class CChamadaFun extends Comando{
	public int linha;
	public String fun;
	public ArrayList<Expressao> args;
	
	public CChamadaFun(int linha,String fun, ArrayList<Expressao> args)
	{
	  this.linha = linha;
	  this.fun = fun;
	  this.args = args;
	} 

}
