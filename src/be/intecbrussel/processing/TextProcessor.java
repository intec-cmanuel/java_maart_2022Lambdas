package be.intecbrussel.processing;

public class TextProcessor {
    private String sentence;

    public TextProcessor(String sentence) {
        this.sentence = sentence;
    }

    public void printProcessedString(WordProcessor wordProcessor) {
        for (String word : sentence.split(" ")) {
            String processedWord = wordProcessor.processWord(word);
            System.out.println(processedWord);
        }
    }
}
