import java.sql.Time;

public class Video extends Media {

    private String videoType;
    private Time videoLenght;
    private String videoSolution;
    private String videoAuthor;

    @Override
    public void logToConsole(){
        System.out.println(this.videoAuthor + this.videoType);
    }
}
