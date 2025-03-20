all: 
	@echo "Executando o compilador Lugosi..."
	javacc Lugosi.jj
	javac *.java
	java Lugosi Testes/teste1.lug
	java Lugosi Testes/teste2.lug
	java Lugosi Testes/teste3.lug
	java Lugosi Testes/teste4.lug
	@echo "Removendo arquivos compilados..."
	rm -f *.class ast/*.class *.java
