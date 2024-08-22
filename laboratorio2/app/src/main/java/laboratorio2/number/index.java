package laboratorio2.number;

public class index {

  public String solicitud(String mensaje, String[] centinela) {
    if (comprobarSolicitud((mensaje)) == 1) {
      // convertiir de decimal a binario
      Decimal_binario binario = new Decimal_binario();
      return binario.convertirDecToBin(Integer.parseInt((centinela[1])), Integer.parseInt((centinela[2])));
    } else {
      if (comprobarSolicitud((mensaje)) == 0) {
        // convertir decimal a hexadecimal
        Decimal_Hexadecimal decimal = new Decimal_Hexadecimal();
        return decimal.convertirDecToHex(Integer.parseInt((centinela[1])), Integer.parseInt((centinela[2])));

      } else {
        // Convertir de binario a hexadecimal
        Decimal_binario hexa = new Decimal_binario();
        return hexa.convertirBinToHex(centinela[1]);
      }
    }
  }

  public int comprobarSolicitud(String mensaje) {

    if (mensaje.equals(("CONV-DEC-HEX"))) {
      return 0;
    } else {
      if (mensaje.equals(("CONV-DEC-BIN"))) {
        return 1;
      } else {
        // binario a hexadecimal
        return 2;
      }
    }
  }

}
