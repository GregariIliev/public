package Articles2;

public class Articles2 {
    private String Title;
    private String Content;
    private String Author;

    public Articles2(String Title, String Content, String Author){
        this.Title = Title;
        this.Content = Content;
        this.Author = Author;
    }

    public String getContent(){
        return this.Content;
    }
    public String  getAuthor(){
        return this.Author;
    }
    public String getTitle(){
        return this.Title;
    }
    public void ToString(){
        System.out.printf("%s - %s: %s%n",Title ,Content ,Author);
    }
}
