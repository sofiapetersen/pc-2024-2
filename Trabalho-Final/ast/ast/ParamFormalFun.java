package ast;
import java.io.PrintWriter;

public class ParamFormalFun{
   public String type;
   public String var;
   
   public ParamFormalFun(String type,String var){
   	this.type = type;
   	this.var  = var;
   }
   public void geraCodigo(PrintWriter out, int nivelIndent) {
      String tipoC;
      tipoC = switch (type) {
           case "float" -> "float";
           case "bool" -> "bool";
           case "int" -> "int";
           default -> type;
       };
    out.print(tipoC + " " + var);
 }
}
