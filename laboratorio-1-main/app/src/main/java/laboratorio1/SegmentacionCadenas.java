package laboratorio1;

public class SegmentacionCadenas {

  public String generarCadena(int tam) {
    String DB = "abcdefghijklmnopqrstuvwxyz";
    String cadena = "";
    int x = 0;
    for (int i = 0; i < tam; i++) {
      if (i > 25) {
        x = i - 26;
      } else {
        x = i;
      }
      cadena = cadena + DB.charAt(x);
    }
    return cadena;
  }

  public SegmentacionCadenas() {
    super();
  }

  public String[] dividirCadena(String s, int tam) {
    int cant = (int) s.length() / tam;// numero de diviciones
    int j = 0; // el que lleva la cuenta en la cadena
    String[] cadena = new String[cant + 1];// la que retorna
    for (int i = 0; i < cant; i++) {// manejo del String[] cadena
      cadena[i] = "";
      for (int x = 0; x < tam; x++) {// manejo del String interno de cadena
        cadena[i] = "" + cadena[i] + s.charAt(j);
        j++;
      }
    }
    cadena[cant] = s.substring(j);
    return cadena;
  }

  public String[] separarCadena(String s, int n) {
    String h[] = new String[2];
    h[0] = s.substring(0, n);
    h[1] = s.substring(n);
    return h;
  }

  public String[] separarCadena(String s, int n, int m) {
    String h[] = new String[3];
    h[0] = s.substring(0, n);
    h[1] = s.substring(n, m);
    h[2] = s.substring(m);
    return h;
  }

  public String unirCadenas(String[] h) {
    String s = "";
    for (int i = 0; i < h.length; i++) {
      s += h[i];
    }
    return s;
  }

  public String[] separarCadena(String[] s, int i) {
    String[] l = new String[s.length + 1];
    for (int j = 0; j < s.length - 1; j++) {
      l[j] = s[j];
    }
    String[] k = separarCadena(s[s.length - 1], i);
    for (int j = s.length - 1; j <= s.length; j++) {
      l[j] = k[j - (s.length - 1)];
    }
    return l;
  }

  public String[] separarCadena(String s, int[] tam) {
    String k[] = new String[1];
    k[0] = s;
    return separarCadena(k, tam, 0);
  }

  public String[] separarCadena(String[] k, int[] tam, int i) {
    if (i == (tam.length - 1)) {
      return separarCadena(k, tam[i]);
    } else {
      return separarCadena(separarCadena(k, tam[i]), tam, i + 1);
    }

  }
}
