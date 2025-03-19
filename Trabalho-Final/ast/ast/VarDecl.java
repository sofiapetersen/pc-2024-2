package ast;
import java.io.PrintWriter;

public class VarDecl{
   public String type;
   public String var;
   
   public VarDecl(String type,String var){
   	this.type = type;
   	this.var  = var;
  }


  public void geraCodigo(PrintWriter out, int nivelIndent) {
      String tipoC;
      tipoC = switch (type) {
           case "float" -> "float";
           case "bool" -> "bool";
           case "void" -> "void";
           default -> type;
       };
      out.println(tipoC + " " + var + ";");
 }
}