package quotes;

public class QuoteAPI {

    protected String quoteAuthor;
    protected String quoteText;

    public QuoteAPI(String quoteAuthor, String quoteText) {
        this.quoteAuthor = quoteAuthor;
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    @Override
    public String toString() {
        return "QuoteAPI{" +
                "quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteText='" + quoteText + '\'' +
                '}';
    }
}
