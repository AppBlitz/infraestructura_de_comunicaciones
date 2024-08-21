package laboratorio2.number;

public class index {

  public String solicitud(String mensaje, String number, int ancho) {
    String centinela = "";
    if (comprobarSolicitud((mensaje)) == 1) {
      // convertiir de decimal a binario
      Decimal_binario binario = new Decimal_binario();
      centinela = binario.convertirDecToBin((Integer.parseInt((number))), ancho);
    } else {
      if (comprobarSolicitud((mensaje)) == 0) {
        // convertir decimal a hexadecimal
        Decimal_Hexadecimal decimal = new Decimal_Hexadecimal();
        centinela = decimal.convertirDecToHex(Integer.parseInt((number)), ancho);

      } else {
        // Convertir de binario a hexadecimal
        Decimal_binario hexa = new Decimal_binario();
        centinela = hexa.convertirBinToHex((number));
      }
    }
    return centinela;
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
