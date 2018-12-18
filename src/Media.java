import javax.xml.stream.events.StartDocument;
import java.io.File;
import java.net.URL;
import java.time.Instant;
import java.util.Date;

public class Media { //Klassens navn er Media

    //4 private data fields bliver erklærede.
    //3 forskellige datatyper: int, String og Date.
    //4 variabel navne: assetId, name, created og fileName.

    private int assetId;
    private String name;
    private Date created = new Date(); //Denne linje initialisere et date objekt.
    private String fileName;

    //Til opgave 9: Denne instantsvariabel vil kunne skelne mellem om indholdet er brugergeneret eller ej (returns true or false).
    private boolean userGenerated;

    //Dette er klassens constructor.
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    //Dette er klassens metoder

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void logToConsole(){
        System.out.println("Name: " + this.name);
    }

    /**
     *
     * @param folderNavn
     * Jeg er nået til opgave 6, hvor jeg har oprettet 2 metoder.
     * Efter disse er min kodning gået i stå.
     *
     */

    public void logMediaFolder(String folderNavn) {

    }

    public void readMediaFolder(String folderNavn) {

    }

    @Override
    public String toString() {
        return "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}