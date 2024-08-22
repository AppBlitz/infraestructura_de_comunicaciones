package laboratorio2.segmentacionCadenas;

public class SegmentacionCadenas {

    public String generarCadena(int tam) {
        String DB = "abcdefghijklmnopqrstuvwxyz";
        String cadena = "";

        for (int i = 0; i < tam; ++i) {
            if (i > 25) {
                i = i - 26;
                tam = tam - 26;
            } else {

                cadena = cadena + DB.charAt(i);
            }

        }

        return cadena;
    }

    public SegmentacionCadenas() {
    }

    public String[] dividirCadena(String s, int tam) {
        int cant = s.length() / tam;
        int j = 0;
        String[] cadena = new String[cant + 1];

        for (int i = 0; i < cant; ++i) {
            cadena[i] = "";

            for (int x = 0; x < tam; ++x) {
                cadena[i] = cadena[i] + s.charAt(j);
                ++j;
            }
        }

        cadena[cant] = s.substring(j);
        return cadena;
    }

    public String[] separarCadena(String s, int n) {
        String[] h = new String[] { s.substring(0, n), s.substring(n) };
        return h;
    }

    public String[] separarCadena(String s, int n, int m) {
        String[] h = new String[] { s.substring(0, n), s.substring(n, m), s.substring(m) };
        return h;
    }

    public String unirCadenas(String[] h) {
        String s = "";

        for (int i = 0; i < h.length; ++i) {
            s = s + h[i];
        }

        return s;
    }

    public String[] separarCadena(String[] s, int i) {
        String[] l = new String[s.length + 1];

        for (int j = 0; j < s.length - 1; ++j) {
            l[j] = s[j];
        }

        String[] k = this.separarCadena(s[s.length - 1], i);

        for (int j = s.length - 1; j <= s.length; ++j) {
            l[j] = k[j - (s.length - 1)];
        }

        return l;
    }

    public String[] separarCadena(String s, int[] tam) {
        String[] k = new String[] { s };
        return this.separarCadena(k, tam, 0);
    }

    public String[] separarCadena(String[] k, int[] tam, int i) {
        return i == tam.length - 1 ? this.separarCadena(k, tam[i])
                : this.separarCadena(this.separarCadena(k, tam[i]), tam, i + 1);
    }

    public String dividirCadenaSegmentos(String cadena, int numero1, int numero2, int numero3) {
        String centinela = "";
        centinela += aux(cadena, numero1, 0) + "," + aux(cadena, (numero1 + numero2), numero1) + ","
                + aux(cadena, (numero1 + numero2 + numero3), (numero1 + numero2));
        return centinela;
    }

    public String aux(String centinela, int numero, int index) {
        String centinala = "";
        for (int i = index; i < numero; i += 1) {
            centinala += centinela.charAt(i);
        }
        return centinala;
    }

}
