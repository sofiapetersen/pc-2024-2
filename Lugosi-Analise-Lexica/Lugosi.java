/* Lugosi.java */
/* Generated By:JavaCC: Do not edit this line. Lugosi.java */
import java.io.*;
public class Lugosi implements LugosiConstants {

  public static void main(String args[]) throws ParseException,IOException {

 Lugosi analisador = new Lugosi(new FileInputStream(args[0]));
 analisador.Lugosi();
  }

  static final public void Lugosi() throws ParseException {
    Main();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DEF:{
      Funcao();
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(0);
}

  static final public void Main() throws ParseException {
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(ACHAVES);
    VarDecl();
    SeqComandos();
    jj_consume_token(FCHAVES);
}

  static final public void VarDecl() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LET:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      jj_consume_token(LET);
      Tipo();
      jj_consume_token(TOKEN_ID);
      jj_consume_token(PONTOEVIRGULA);
    }
}

  static final public void Tipo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FLOAT:{
      jj_consume_token(FLOAT);
      break;
      }
    case BOOL:{
      jj_consume_token(BOOL);
      break;
      }
    case VOID:{
      jj_consume_token(VOID);
      break;
      }
    case INT:{
      jj_consume_token(INT);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void SeqComandos() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IF:
      case WHILE:
      case RETURN:
      case PRINTIO:
      case TOKEN_ID:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      Comando();
    }
}

  static final public void Comando() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TOKEN_ID:{
      jj_consume_token(TOKEN_ID);
      ComandoTokenID();
      break;
      }
    case IF:{
      jj_consume_token(IF);
      Expressao();
      jj_consume_token(ACHAVES);
      SeqComandos();
      jj_consume_token(FCHAVES);
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      Expressao();
      jj_consume_token(DO);
      jj_consume_token(ACHAVES);
      SeqComandos();
      jj_consume_token(FCHAVES);
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    case RETURN:{
      jj_consume_token(RETURN);
      Expressao();
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    case PRINTIO:{
      jj_consume_token(PRINTIO);
      Expressao();
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void ComandoTokenID() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DOISPONTOSIGUAL:{
      jj_consume_token(DOISPONTOSIGUAL);
      ComandoTokenIDAttrib();
      break;
      }
    case APARENTESES:{
      jj_consume_token(APARENTESES);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case APARENTESES:
      case TRUE:
      case FALSE:
      case TOKEN_ID:
      case TOKEN_NUMLIT:{
        ListaExpressao();
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      jj_consume_token(FPARENTESES);
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void ComandoTokenIDAttrib() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case APARENTESES:
    case TRUE:
    case FALSE:
    case TOKEN_ID:
    case TOKEN_NUMLIT:{
      Expressao();
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    case READIO:{
      jj_consume_token(READIO);
      jj_consume_token(APARENTESES);
      jj_consume_token(FPARENTESES);
      jj_consume_token(PONTOEVIRGULA);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Expressao() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case APARENTESES:{
      jj_consume_token(APARENTESES);
      Expressao();
      OP();
      Expressao();
      jj_consume_token(FPARENTESES);
      break;
      }
    case TRUE:
    case FALSE:
    case TOKEN_ID:
    case TOKEN_NUMLIT:{
      Fator();
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Fator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TOKEN_ID:{
      jj_consume_token(TOKEN_ID);
      Fator_();
      break;
      }
    case TOKEN_NUMLIT:{
      jj_consume_token(TOKEN_NUMLIT);
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void Fator_() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case APARENTESES:{
      jj_consume_token(APARENTESES);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case APARENTESES:
      case TRUE:
      case FALSE:
      case TOKEN_ID:
      case TOKEN_NUMLIT:{
        ListaExpressao();
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      jj_consume_token(FPARENTESES);
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      ;
    }
}

  static final public void OP() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SUM:{
      jj_consume_token(SUM);
      break;
      }
    case SUB:{
      jj_consume_token(SUB);
      break;
      }
    case MULT:{
      jj_consume_token(MULT);
      break;
      }
    case DIV:{
      jj_consume_token(DIV);
      break;
      }
    case AND:{
      jj_consume_token(AND);
      break;
      }
    case OR:{
      jj_consume_token(OR);
      break;
      }
    case MENOR:{
      jj_consume_token(MENOR);
      break;
      }
    case MAIOR:{
      jj_consume_token(MAIOR);
      break;
      }
    case IGUAL:{
      jj_consume_token(IGUAL);
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void ListaExpressao() throws ParseException {
    Expressao();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VIRGULA:{
        ;
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        break label_3;
      }
      jj_consume_token(VIRGULA);
      Expressao();
    }
}

  static final public void Funcao() throws ParseException {
    label_4:
    while (true) {
      jj_consume_token(DEF);
      Tipo();
      jj_consume_token(TOKEN_ID);
      jj_consume_token(APARENTESES);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VOID:
      case INT:
      case FLOAT:
      case BOOL:{
        ListaArg();
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        ;
      }
      jj_consume_token(FPARENTESES);
      jj_consume_token(ACHAVES);
      VarDecl();
      SeqComandos();
      jj_consume_token(FCHAVES);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DEF:{
        ;
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        break label_4;
      }
    }
}

  static final public void ListaArg() throws ParseException {
    Tipo();
    jj_consume_token(TOKEN_ID);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VIRGULA:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_5;
      }
      jj_consume_token(VIRGULA);
      Tipo();
      jj_consume_token(TOKEN_ID);
    }
}

  static final public void Atribuicao() throws ParseException {
    jj_consume_token(DOISPONTOSIGUAL);
    Expressao();
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void If() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(APARENTESES);
    Expressao();
    jj_consume_token(FPARENTESES);
    jj_consume_token(ACHAVES);
    SeqComandos();
    jj_consume_token(FCHAVES);
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void While() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(APARENTESES);
    Expressao();
    jj_consume_token(FPARENTESES);
    jj_consume_token(DO);
    jj_consume_token(ACHAVES);
    SeqComandos();
    jj_consume_token(FCHAVES);
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void Do() throws ParseException {
    jj_consume_token(DO);
    jj_consume_token(ACHAVES);
    SeqComandos();
    jj_consume_token(FCHAVES);
    jj_consume_token(WHILE);
    jj_consume_token(APARENTESES);
    Expressao();
    jj_consume_token(FPARENTESES);
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void Return() throws ParseException {
    jj_consume_token(RETURN);
    Expressao();
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void Print() throws ParseException {
    jj_consume_token(PRINTIO);
    jj_consume_token(APARENTESES);
    Expressao();
    jj_consume_token(FPARENTESES);
    jj_consume_token(PONTOEVIRGULA);
}

  static final public void ChamadaFuncao() throws ParseException {
    jj_consume_token(APARENTESES);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case APARENTESES:
    case TRUE:
    case FALSE:
    case TOKEN_ID:
    case TOKEN_NUMLIT:{
      ListaExpressao();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    jj_consume_token(FPARENTESES);
    jj_consume_token(PONTOEVIRGULA);
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
  static final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x0,0x4000,0x3900,0x6c0000,0x6c0000,0x1810000,0x18000,0x1810000,0x1810000,0x1800000,0x1810000,0x10000,0xfe000000,0x0,0x3900,0x0,0x0,0x1810000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x20,0x0,0x0,0x40,0x40,0xc0,0x0,0xd0,0xc0,0xc0,0xc0,0x0,0x3,0x4,0x0,0x20,0x4,0xc0,};
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
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
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
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LugosiTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 18; i++) jj_la1[i] = -1;
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
	 boolean[] la1tokens = new boolean[42];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 18; i++) {
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
	 for (int i = 0; i < 42; i++) {
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
