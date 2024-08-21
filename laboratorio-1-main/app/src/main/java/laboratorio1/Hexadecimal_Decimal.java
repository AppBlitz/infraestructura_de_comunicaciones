package laboratorio1;

import javax.swing.*;

public class Hexadecimal_Decimal {

    public int convertirHexToDec(String hexa) {

        return Integer.parseInt(hexa, 16);
    }

    public String convertirDecToHex(int dec, int banda) {

        String h;
        h = Integer.toHexString(dec);
        int c = h.length();
        if (c > banda) {
            h = h.substring(c - banda, c - 1);
        }
        return h;
    }

}
