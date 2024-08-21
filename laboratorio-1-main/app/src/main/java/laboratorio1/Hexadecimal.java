package laboratorio1;

public class Hexadecimal {

  /**
   * Retorna el número hexadecimal al cual corresponde el binario
   * 
   * @param hexa
   * @return String
   */
  public String converHexToBin(String hexa) {
    String centinela = "";
    for (int i = 0; i < hexa.length(); i += 1) {
      if (hexa.charAt((i)) >= 97 && hexa.charAt((i)) <= 102) {
        centinela += binario(character((hexa.charAt((i)))));
      } else {
        centinela += binario(Integer.parseInt(hexa.charAt(i) + ""));
      }
    }
    return centinela;
  }

  /**
   * Retornar el binario
   * 
   * @param number
   * @return String
   */
  public String binario(int number) {
    String centinela = "";
    while (number != 0) {
      centinela += number % 2;
      number /= 2;
    }
    return invertir(count(centinela));
  }

  /**
   * Invierte la cadena para acomodar el número
   * 
   * @param cadena
   * @return String
   */
  public String invertir(String cadena) {
    String centinela = cadena;
    cadena = "";
    for (int i = centinela.length() - 1; i >= 0; i -= 1) {
      cadena += centinela.charAt((i));
    }
    return cadena;
  }

  /**
   * Agrega los binarios necesario
   * 
   * @param number
   * @return String
   */
  public String count(String number) {
    while (number.length() != 4) {
      number += 0;
    }
    return number;
  }

  /**
   * Retorna el valor correspondiente en decimal
   * 
   * @param character
   * @return int
   */
  public int character(char character) {
    if (character == 'a') {
      return 10;
    } else if (character == 'b') {
      return 11;
    } else if (character == 'c') {
      return 12;
    } else if (character == 'd') {
      return 13;
    } else if (character == 'e') {
      return 14;
    } else {
      return 15;
    }
  }

  /**
   * Returnretorna el numero hexadecimal
   * 
   * @param number
   * @return String
   */
  public String converBinToHex(String number) {
    Decimal_binario dec = new Decimal_binario();
    return (Integer.toHexString(dec.convertirBinToDec((number))));
  }

}
