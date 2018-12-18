public class Main { //Klassens navn er Main

    /**
     *
     *  Nedenstående linje viser en variabel kaldet SOFTWARE_VERSION som er af datatypen String.
     *  Denne string returnere 0.1.0 eller softwarens version.
     *
     *  Linjen har også 3 keywords.
     *
     *  public = Bruges til at deklarer.
     *  static = Bruges også til at deklarer, dog med den egenskab, at gøre data'en "statisk".
     *  final = definere linjen til ikke at kunne ændres andetssteds senere hen.
     *
     */

    public static final String SOFTWARE_VERSION = "0.1.0";

    /**
     *
     * Nedenstående linje viser en variabel kaldet MEDIA_MAPPE som er af datatypen String.
     * Denne string returnere media/ som nok vil kendetegne selve stien i softwaren.
     *
     * Linjen har også de samme 3 keywoards som før nemlig public, static og final.
     *
     */

    public static final String MEDIA_MAPPE = "media/";

    /**
     *
     * Nedenstående linje er main methoden har altid denne syntax.
     * Det er den som får hele programmet til at køre.
     *
     * I dette tilfælde kører den "Test" klassen's metode.
     *
     *
     */

    public static void main(String[] args) {

        Test.test();

    }
}

