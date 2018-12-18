import javafx.scene.shape.Arc;

import java.util.ArrayList;

public class Test {


    // Denne metode indeholder kode, som kan vise applikationens funktionalitet (ikke unit test)
    public static void test() {

        System.out.println("TV2 Media Manager " + Main.SOFTWARE_VERSION);

        Media m1 = new Media();
        m1.setName("Julemanden");
        m1.setFileName("julemand.jpg");
        System.out.println("Media {" + m1.toString());

        // Her kommer din kode

        Video v1 = new Video();
        v1.setName("Peter");
        v1.setFileName("juleaften.mp4");
        System.out.println("Video {" + v1.toString());

        Picture p1 = new Picture();
        p1.setName("Hans");
        p1.setFileName("juleand.jpg");
        System.out.println("Picture {" + p1.toString());

        Article a1 = new Article();
        a1.setName("Jens");
        System.out.println("Article {" + a1.toString());
    }
}
