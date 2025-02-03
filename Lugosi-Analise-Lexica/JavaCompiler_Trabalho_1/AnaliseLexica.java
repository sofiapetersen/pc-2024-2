import java.io.*;

enum TokenType { NUM, SOMA, MULT, SUB, DIV, APar, FPar, EOF }

class Token {
    String lexema;
    TokenType token;

    Token(String l, TokenType t) {
        lexema = l;
        token = t;
    }
}

class AnaliseLexica {

    PushbackReader arquivo; // troca de Buffered pra Pushback

    AnaliseLexica(String a) throws Exception {
        this.arquivo = new PushbackReader(new FileReader(a));
    }

    Token getNextToken() throws Exception {
        int eof = -1;
        char currchar;
        int currchar1;

        do {
            currchar1 = arquivo.read();
            currchar = (char) currchar1;
        } while (currchar == '\n' || currchar == ' ' || currchar == '\t' || currchar == '\r');

        if (currchar1 != eof && currchar1 != 10) {
            if (Character.isDigit(currchar)) {
                StringBuilder numero = new StringBuilder();
                numero.append(currchar);

                while ((currchar1 = arquivo.read()) != eof) {
                    currchar = (char) currchar1;
                    if (Character.isDigit(currchar)) {
                        numero.append(currchar); //junta os caracteres
                    } else {
                        arquivo.unread(currchar1); //se nao for caracter ele dá um unread e entra no switch
                        break;
                    }
                }
                return new Token(numero.toString(), TokenType.NUM);
            } else {
                switch (currchar) {
                    case '(':
                        return new Token(String.valueOf(currchar), TokenType.APar);
                    case ')':
                        return new Token(String.valueOf(currchar), TokenType.FPar);
                    case '+':
                        return new Token(String.valueOf(currchar), TokenType.SOMA);
                    case '*':
                        return new Token(String.valueOf(currchar), TokenType.MULT);
					case '-':
                        return new Token(String.valueOf(currchar), TokenType.SUB);
					case '/':
                        return new Token(String.valueOf(currchar), TokenType.DIV);
                    default:
                        throw new Exception("Caractere inválido: " + ((int) currchar));
                }
            }
        }

        arquivo.close();
        return new Token("", TokenType.EOF);
    }
}
