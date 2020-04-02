package TextAnalyzer;

public class Test {
    public static void main(String[] args) {
System.out.println("rOMA PIDR");
    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        //Твой код здесь
        for (TextAnalyzer analyzer: analyzers) {
            return analyzer.processText(text);
        }
        return Label.OK;
    }

}
