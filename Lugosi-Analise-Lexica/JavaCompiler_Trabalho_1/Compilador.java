class Compilador {
    public static void main(String[] args) {
        ArvoreSintatica arv = null;
        
        try {
            AnaliseLexica al = new AnaliseLexica(args[0]);
            Parser as = new Parser(al);
            
            arv = as.parseProg();
            
            CodeGen backend = new CodeGen();
            int codigo = backend.interpretaCodigo(arv);
            System.out.println("Resultado: " + codigo);
            
            backend.geraArquivo(arv, "testePilha");
            System.out.println("Código gerado e salvo em testePilha");
        } catch (Exception e) {
            System.out.println("Erro de compilação:\n" + e);
        }
    }
}