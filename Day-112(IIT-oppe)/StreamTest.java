import java.util.*;
import java.util.stream.*;

class ResearchArticle {
    // private variables
    private String title;
    private int publicationYear;
    private int numCitations;

    // constructor
    public ResearchArticle(String title, int publicationYear, int numCitations) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.numCitations = numCitations;
    }

    // accessor methods
    public int getPublicationYear() {
        return publicationYear;
    }

    public int getNumCitations() {
        return numCitations;
    }

    // toString method
    public String toString() {
        return title + " " + publicationYear + " " + numCitations;
    }

    // static method for filtering
    public static Stream<ResearchArticle> articleProcessor(ArrayList<ResearchArticle> articles) {
        return articles.stream()
                .filter(article -> (2023 - article.getPublicationYear() <= 3)) // recent
                .filter(article -> article.getNumCitations() > 100);          // highly cited
    }
}

public class StreamTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of articles
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<ResearchArticle> articles = new ArrayList<>();

        // input
        for (int i = 0; i < n; i++) {
            String title = sc.nextLine();
            int year = sc.nextInt();
            int citations = sc.nextInt();
            sc.nextLine();
            articles.add(new ResearchArticle(title, year, citations));
        }

        // process and print
        ResearchArticle.articleProcessor(articles)
                .forEach(System.out::println);
    }
}
