package laboratorio1;

public class App {

    public static void main(String[] args) {
        Hexadecimal hexa = new Hexadecimal();
        SegmentacionCadenas seg = new SegmentacionCadenas();
        Decimal_binario decimal = new Decimal_binario();

        // Pasar número de binario a hexadecimal
        System.out.println(hexa.converBinToHex(("1111110001")) + " Hexadecimal  a binario ");

        // Pasar número hexadecimal a binario
        System.out.println(hexa.converHexToBin(("adf")) + " Binario a hexadecimal");

        // Pasar número decimal a bianrio
        System.out.println(decimal.convertirDecToBin((12), 2) + " Decimal a binario");

        // Pasar número de binario a decimal
        System.out.println(decimal.convertirBinToDec(("110011001")) + " Binario a decimal");

        // Separar cadena por tamaño
        System.out.println(seg.generarCadena((5)));

        // Dividir cadena
        System.out.println(seg.dividirCadena(("abcdeqfsnvksnvklskvjs"), 4));

        // Separar cadena
        System.out.println(seg.separarCadena(("cadenaseparaar"), 3, 5));

        // Separar cadena
        String[] aux = { "ks", "jisv", "kjvkonsjvoks", "ksnvknkvno'00qwiouuu" };
        System.out.println(seg.separarCadena((aux), 6));

    }

}
