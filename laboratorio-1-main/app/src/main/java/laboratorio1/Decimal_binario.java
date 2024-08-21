package laboratorio1;

public class Decimal_binario {

  /**
   * @param number
   * @param ancho
   * @return binario
   */
  public String convertirDecToBin(int number, int ancho) {
    String centinela = "";
    int x = 0;
    while (number != 0) {
      x = number % 2;
      centinela += x;
      number = number / 2;
    }
    return invertir(centinela, ancho);
  }

  /**
   * 
   * @param binario
   * @return decimal
   */
  public int convertirBinToDec(String binario) {
    int centinela = 0;
    int k = 0;
    for (int i = binario.length() - 1; i >= 0; i -= 1) {
      if (binario.charAt((i)) != '0') {
        centinela += Math.pow(2, k);
      }
      k += 1;
    }
    return centinela;
  }

  /**
   * @param number
   * @param ancho
   * @return
   */
  public String addAncho(String number, int ancho) {

    int x = ancho - number.length();
    for (int i = 1; i <= (x); i += 1) {
      number += 0;
    }
    return number;
  }

  /**
   * @param number
   * @param ancho
   * @return
   */
  public String invertir(String number, int ancho) {
    String centinela = addAncho((number), ancho);
    number = "";
    for (int i = centinela.length() - 1; i >= 0; i -= 1) {
      number += centinela.charAt(i);
    }
    return number;
  }

}
