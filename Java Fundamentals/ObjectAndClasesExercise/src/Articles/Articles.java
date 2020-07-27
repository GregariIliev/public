package Articles;

public class Articles {
    private String Title;
    private String Content;
    private String Author;

    public Articles(String Title, String Content, String Author){
        this.Title = Title;
        this.Content = Content;
        this.Author = Author;
    }

    public void Edit(String newContent){
        this.Content = newContent;
    }
    public void  ChangeAuthor(String newAuthor){
        this.Author = newAuthor;
    }
    public void  Rename(String newTitle){
        this.Title = newTitle;
    }
    public String ToString(){
        String result = String.format("%s - %s: %s",Title ,Content ,Author);
        return result;
    }
}
