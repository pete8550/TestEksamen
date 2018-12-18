import java.io.File;
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

    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}