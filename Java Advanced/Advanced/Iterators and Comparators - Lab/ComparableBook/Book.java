

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if (result == 0){
            result = Integer.compare(this.year, other.year);
        }
        return result;
    }

    private static final class CompareBook implements Comparator<Book> {

        @Override
        public int compare(Book book1, Book book2) {
            int result = 0;
            if (book1.compareTo(book2) > 0){
                return 1;
            }else if (book1.compareTo(book2) < 0){
                return -1;
            }
            return result;
        }
    }
}
