/* Lugosi.java */
/* Generated By:JavaCC: Do not edit this line. Lugosi.java */
import java.io.*;
public class Lugosi implements LugosiConstants {

  public static void main(String args[]) throws ParseException,IOException {

 Lugosi analisador = new Lugosi(new FileInputStream(args[0]));
 analisador.Lugosi();
  }

  static final public void Lugosi() throws ParseException {Token t;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MAIN:
      case ACHAVES:
      case FCHAVES:
      case VOID:
      case VAR:
      case PONTOEVIRGULA:
      case INT:
      case FLOAT:
      case BOOL:
      case LET:
      case DOISPONTOSIGUAL:
      case APARENTESES:
      case FPARENTESES:
      case IF:
      case WHILE:
      case DO:
      case RETURN:
      case PRINTIO:
      case TRUE:
      case FALSE:
      case SUM:
      case SUB:
      case MULT:
      case DIV:
      case AND:
      case OR:
      case MENOR:
      case MAIOR:
      case IGUAL:
      case VIRGULA:
      case FUNCAO:
      case READIO:
      case DEF:
      case NUM:
      case ID:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MAIN:{
        jj_consume_token(MAIN);
System.out.println("Palavra reservada: main");
        break;
        }
      case ACHAVES:{
        jj_consume_token(ACHAVES);
System.out.println("Abre chaves: {");
        break;
        }
      case FCHAVES:{
        jj_consume_token(FCHAVES);
System.out.println("Fecha chaves: }");
        break;
        }
      case VOID:{
        jj_consume_token(VOID);
System.out.println("Palavra reservada: void");
        break;
        }
      case NUM:{
        t = jj_consume_token(NUM);
System.out.println("N\u00famero: "+ t.image);
        break;
        }
      case ID:{
        t = jj_consume_token(ID);
System.out.println("Identificador: "+ t.image);
        break;
        }
      case VAR:{
        jj_consume_token(VAR);
System.out.println("Palavra reservada: var");
        break;
        }
      case LET:{
        jj_consume_token(LET);
System.out.println("Palavra reservada: let");
        break;
        }
      case INT:{
        jj_consume_token(INT);
System.out.println("Palavra reservada: int");
        break;
        }
      case FLOAT:{
        jj_consume_token(FLOAT);
System.out.println("Palavra reservada: float");
        break;
        }
      case PONTOEVIRGULA:{
        jj_consume_token(PONTOEVIRGULA);
System.out.println("Ponto e virgula: ;");
        break;
        }
      case BOOL:{
        jj_consume_token(BOOL);
System.out.println("Palavra reservada: bool");
        break;
        }
      case DOISPONTOSIGUAL:{
        jj_consume_token(DOISPONTOSIGUAL);
System.out.println("Atribui\u00e7\u00e3o: :=");
        break;
        }
      case APARENTESES:{
        jj_consume_token(APARENTESES);
System.out.println("Abre par\u00eanteses: (");
        break;
        }
      case FPARENTESES:{
        jj_consume_token(FPARENTESES);
System.out.println("Fecha par\u00eanteses: )");
        break;
        }
      case IF:{
        jj_consume_token(IF);
System.out.println("Palavra reservada: if");
        break;
        }
      case WHILE:{
        jj_consume_token(WHILE);
System.out.println("Palavra reservada: while");
        break;
        }
      case DO:{
        jj_consume_token(DO);
System.out.println("Palavra reservada: do");
        break;
        }
      case RETURN:{
        jj_consume_token(RETURN);
System.out.println("Palavra reservada: return");
        break;
        }
      case PRINTIO:{
        jj_consume_token(PRINTIO);
System.out.println("Palavra reservada: printIO");
        break;
        }
      case TRUE:{
        jj_consume_token(TRUE);
System.out.println("Valor l\u00f3gico: true");
        break;
        }
      case FALSE:{
        jj_consume_token(FALSE);
System.out.println("Valor l\u00f3gico: false");
        break;
        }
      case SUM:{
        jj_consume_token(SUM);
System.out.println("Soma: +");
        break;
        }
      case SUB:{
        jj_consume_token(SUB);
System.out.println("Subtra\u00e7\u00e3o: -");
        break;
        }
      case MULT:{
        jj_consume_token(MULT);
System.out.println("Multiplica\u00e7\u00e3o: *");
        break;
        }
      case DIV:{
        jj_consume_token(DIV);
System.out.println("Divis\u00e3o: /");
        break;
        }
      case AND:{
        jj_consume_token(AND);
System.out.println("Fun\u00e7\u00e3o l\u00f3gica: &&");
        break;
        }
      case OR:{
        jj_consume_token(OR);
System.out.println("Fun\u00e7\u00e3o l\u00f3gica: ||");
        break;
        }
      case MENOR:{
        jj_consume_token(MENOR);
System.out.println("Compara\u00e7\u00e3o: <");
        break;
        }
      case MAIOR:{
        jj_consume_token(MAIOR);
System.out.println("Compara\u00e7\u00e3o: >");
        break;
        }
      case IGUAL:{
        jj_consume_token(IGUAL);
System.out.println("Compara\u00e7\u00e3o: ==");
        break;
        }
      case VIRGULA:{
        jj_consume_token(VIRGULA);
System.out.println("V\u00edrgula: ,");
        break;
        }
      case FUNCAO:{
        jj_consume_token(FUNCAO);
System.out.println("Palavra reservada: function");
        break;
        }
      case READIO:{
        jj_consume_token(READIO);
System.out.println("Palavra reservada: readIO");
        break;
        }
      case DEF:{
        jj_consume_token(DEF);
System.out.println("Palavra reservada: def");
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public LugosiTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xffffffe0,0xffffffe0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0xff,0xff,};
	}

  /** Constructor with InputStream. */
  public Lugosi(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Lugosi(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new LugosiTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Lugosi(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new LugosiTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new LugosiTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Lugosi(LugosiTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LugosiTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[40];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 2; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 40; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
