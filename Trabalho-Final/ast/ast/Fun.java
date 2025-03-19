package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome 	 = nome;
		this.params  = params;
		this.retorno = retorno;
		this.vars 	 = vars;
		this.body 	 = body;
	}

	public void geraCodigo(PrintWriter out, int nivelIndent) {
		String indentacao = "    ".repeat(nivelIndent); // 4 espaços por nível
	
		out.print(indentacao + retorno + " " + nome + "(");
		
		if (params != null && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i++) {
				params.get(i).geraCodigo(out, nivelIndent);
				if (i < params.size() - 1) {
					out.print(", ");
				}
			}
		}
		
		out.println(") {");
	
		if (vars != null) {
			for (VarDecl var : vars) {
				out.print(indentacao + "    "); // Adiciona indentação extra
				var.geraCodigo(out, nivelIndent + 1);
			}
		}
		
		boolean temReturn = false;
	
		if (body != null) {
			for (Comando comando : body) {
				out.print(indentacao + "    "); // Adiciona indentação extra
				comando.geraCodigo(out, nivelIndent);
	
				if (comando instanceof CReturn) {
					temReturn = true;
				}
			}
		}
	
		// Garante um retorno válido se necessário
		if (!temReturn && !retorno.equals("void")) {
			out.println(indentacao + "    return 0;"); 
		}
	
		out.println(indentacao + "}");
	}
	
	
}
