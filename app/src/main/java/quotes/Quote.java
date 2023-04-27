package quotes;

public class Quote {

    protected String[] tag;
    protected String author;
    protected String likes;
    protected String text;

    //methods

    //getters
    public String[] getTag() {
        return tag;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    //setters

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "tag='" + tag + '\'' +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
