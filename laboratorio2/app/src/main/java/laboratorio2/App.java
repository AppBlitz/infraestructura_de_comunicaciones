/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package laboratorio2;

import laboratorio2.number.index;
import laboratorio2.segmentacionCadenas.SegmentacionCadenas;

public class App {

    public static void main(String[] args) {

        SegmentacionCadenas seg = new SegmentacionCadenas();
        String cadena = seg.dividirCadenaSegmentos("abcdefghijklmnop", 5, 9, 2);
        System.out.println(cadena);
        System.out.println("Hello world");

    }
}
