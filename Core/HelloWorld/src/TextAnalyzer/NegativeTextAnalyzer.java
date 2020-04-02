package TextAnalyzer;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
