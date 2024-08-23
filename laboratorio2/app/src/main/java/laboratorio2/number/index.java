package laboratorio2.number;

public class index {

  public String solicitud(int sol, String[] centinela) {
    String ayuda="";
    //int x=Integer.parseInt(centinela[1]);
    //int y= Integer.parseInt(centinela[2]);
    if (sol == 1) {
      ayuda= decimalAbinario(Integer.parseInt(centinela[1]),Integer.parseInt(centinela[2]));
    } else if (sol==0){
      ayuda =decimalAhexadecimal(Integer.parseInt(centinela[1]),Integer.parseInt(centinela[2]));
    }
    else if (sol==2){
      ayuda = binarioAhexadecimal(centinela[1]);
    }
    return ayuda;
  }
  public String decimalAbinario (int n,int x){
    Decimal_binario binario = new Decimal_binario();
    return binario.convertirDecToBin(n,x);
  }
  public String decimalAhexadecimal (int n,int y){
    Decimal_Hexadecimal decimal = new Decimal_Hexadecimal();
    return decimal.convertirDecToHex(n,y);
  }
  public String  binarioAhexadecimal (String centinela){
    Decimal_binario hexa = new Decimal_binario();
    return hexa.convertirBinToHex(centinela);
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
