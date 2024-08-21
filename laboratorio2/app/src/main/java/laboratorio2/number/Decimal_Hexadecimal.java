package laboratorio2.number;

public class Decimal_Hexadecimal {
  /**
   * Convierte un número decimal a hexadecimal
   * 
   * @param dec
   * @param banda
   * @return numero hexadecimal
   */
  public String convertirDecToHex(int dec, int banda) {

    String h = "";
    h = Integer.toHexString(dec);
    h = addAncho(h, banda) + h;
    return h;
  }

  public String addAncho(String number, int ancho) {
    String centinela = "";
    int x = ancho - number.length();
    for (int i = 0; i < x; i += 1) {
      centinela += '0';
    }
    return centinela;
  }
}
