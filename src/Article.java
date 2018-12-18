public class Article extends Media {

    private String articleAuthor;
    private String articleText;
    private String articlePicture; //Dette er en path til artiklens billede.

    @Override
    public void logToConsole() {
        System.out.println(this.articleAuthor);
    }
}
