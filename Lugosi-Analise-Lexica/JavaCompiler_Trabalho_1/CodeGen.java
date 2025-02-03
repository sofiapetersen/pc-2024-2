import java.io.FileWriter;
import java.io.IOException;

class CodeGen{

	int interpretaCodigo (ArvoreSintatica arv)
	{
		return (interpretaCodigo2(arv));
	}
	int interpretaCodigo2 (ArvoreSintatica arv)
	{
		if (arv instanceof Mult)
			return (interpretaCodigo(((Mult) arv).arg1) * 
				interpretaCodigo(((Mult) arv).arg2));

		if (arv instanceof Soma)
			return (interpretaCodigo(((Soma) arv).arg1) + 
				interpretaCodigo(((Soma) arv).arg2));

		if (arv instanceof Sub)
			return (interpretaCodigo(((Sub) arv).arg1) - 
				interpretaCodigo(((Sub) arv).arg2));

		if (arv instanceof Div)
			return (interpretaCodigo(((Div) arv).arg1) / 
				interpretaCodigo(((Div) arv).arg2));

		if (arv instanceof Num)
			return ((Num) arv).num;

		return 0;
	}

	
	String geraCodigo (ArvoreSintatica arv)
	{
		return (geraCodigo2(arv) + "PRINT");
	}
	String geraCodigo2 (ArvoreSintatica arv)
	{

	if (arv instanceof Mult)
		return (geraCodigo2(((Mult) arv).arg1) + 
			geraCodigo2(((Mult) arv).arg2) +
			"MULT\n");

	if (arv instanceof Soma)
		return (geraCodigo2(((Soma) arv).arg1) + 
			geraCodigo2(((Soma) arv).arg2) +
			"SUM\n");

	if (arv instanceof Sub)
		return (geraCodigo2(((Sub) arv).arg1) + 
			geraCodigo2(((Sub) arv).arg2) +
			"SUB\n");

	if (arv instanceof Div)
		return (geraCodigo2(((Div) arv).arg1) + 
			geraCodigo2(((Div) arv).arg2) +
			"DIV\n");
			
	if (arv instanceof Num)
		return ("PUSH "  + ((Num) arv).num + "\n");

	return "";
	}

	void geraArquivo(ArvoreSintatica arv, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(geraCodigo(arv));
        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());
        }
    }
}
