public class Picture extends Media {

    private String pictureType;
    private int pictureWidth;
    private int pictureHeight;
    private String pictureAuthor;


    @Override
    public void logToConsole() {
        System.out.println(this.pictureAuthor + this.pictureType);
    }
}