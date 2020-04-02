public class Comment {
    public static void main(String[] args) {

        TextAnalyzer analyzerSpam = new SpamAnalyzer(new String[]{"1223", "2 3", "е"});
        TextAnalyzer analyzerNegativ = new NegativeTextAnalyzer();
        TextAnalyzer analyzerLong = new TooLongTextAnalyzer(100);
        TextAnalyzer [] analyzers = new TextAnalyzer[]{analyzerLong, analyzerNegativ, analyzerSpam};

//        System.out.println(checkLabels(analyzers, "123 uuuu  =q uuu"));
     char c = (char)-1;
     int  i = c;
        System.out.println(i);



    }
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {


        for (TextAnalyzer analyzer: analyzers) {
            if (!analyzer.processText(text).equals(Label.OK))
            return analyzer.processText(text);
        }
        return Label.OK;
    }
}
abstract class KeywordAnalyzer implements TextAnalyzer {


     public Label processText(String text) {
         Label label = Label.OK;

        for (String s: getKeywords()) {

            if (text.indexOf(s) > 0)

            label =  getLabel();
        }
        return label;
    }

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();


}

class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;



    public SpamAnalyzer(String[] keywords) {

        this.keywords = keywords;
    }


    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    protected String[] getKeywords() {
        return keywords;
    }


}
    class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        else return Label.OK;
    }
}
 class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    public NegativeTextAnalyzer() {
    }


    @Override
    protected String[] getKeywords() {
         String[] strings = {":(", "=(", ":|"};
        return strings;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
