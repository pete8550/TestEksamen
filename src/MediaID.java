import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID { //Klassens navn er MediaID

    private static int latestId = 100; //Variablen latestId af datatypen int blev sat til at have en værdi på 100.

    //Dette er metodens "hoved", hvor denne metode hedder generate.
    public static int generate() {

        //Alt inde for disse klammer{} er metodens "krop".

        File file = new File("media_id.txt"); //Et nyt Fil objekt bliver initialiseret

        // Låser filen op før adgang
        // file.setWritable(true);

        try { //try og catch hænger sammen. Hvis der i koden imellem klammerne{} har undtagelser, så fanger "try" disse
            //og dernæst bearbejder "catch" denne undtagelse.


            //Dette er en if-statement udfører noget. I dette tilfælde "hvis" file eksistere, så udfører den koden.
            if (file.exists()) {
                FileReader fileReader = new FileReader(file); //initialisere et nyt fileReader objekt.
                Scanner scanner = new Scanner(file); //initialisere et nyt scanner objekt.
                latestId = (int) scanner.nextInt(); //"opdatere" variablen latestID's værdi til det brugeren indtaster.
            }

            latestId++; //increment (altså +1)

            FileWriter fileWriter = new FileWriter(file); //initialisere et nyt fileWriter objekt.
            fileWriter.write(Integer.toString(latestId)); //Vil returnere latestId som en string representation.
            fileWriter.close(); //close metoden lukker filen "fileWriter".

        } catch (IOException e) { //try og catch har jeg forklaret for oven, men i dette tilfælde tror jeg denne try og catch
            e.printStackTrace(); //er til for at undersøge og vende tilbage, hvis ikke man har adgang til at skrive på filen.
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId; //Returnere latestId
    }

}