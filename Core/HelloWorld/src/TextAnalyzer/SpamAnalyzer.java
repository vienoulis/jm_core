package TextAnalyzer;

import com.sun.org.apache.regexp.internal.RE;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String[] keywords;



    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    protected String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }
}
