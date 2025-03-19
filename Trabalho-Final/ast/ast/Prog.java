package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Prog {
    private final Main main;
    private final ArrayList<Fun> funs;

    public Prog(Main main, ArrayList<Fun> funs) {
        this.main = main;
        this.funs = funs;
    }

    public ArrayList<Fun> getFuns() {
        return funs;
    }

    public Main getMain() {
        return main;
    }

    public void geraCodigo(PrintWriter out, int nivelIndent) {
        String indentacao = "    ".repeat(nivelIndent); // 4 espaços por nível
    
        if (funs != null) {
            for (Fun f : funs) {
                f.geraCodigo(out, nivelIndent);
                out.println();
            }
        }
    
        out.println(indentacao + "int main() {");
        main.geraCodigo(out, nivelIndent + 1);
        out.println(indentacao + "    return 0;");
        out.println(indentacao + "}");
    }
    
}
