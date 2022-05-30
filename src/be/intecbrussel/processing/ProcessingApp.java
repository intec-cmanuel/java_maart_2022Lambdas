package be.intecbrussel.processing;

public class ProcessingApp {
    public static void main(String[] args) {
        String sentence = "euhm... ik heb een lekkere smos kaas gegeten, het was fantastisch.";
        TextProcessor textProcessor = new TextProcessor(sentence);

        textProcessor.printProcessedString((String word) -> word.toUpperCase());


        textProcessor.printProcessedString(new WordProcessor() {
            @Override
            public String processWord(String word) {
                return word.toUpperCase();
            }
        });
    }
}
