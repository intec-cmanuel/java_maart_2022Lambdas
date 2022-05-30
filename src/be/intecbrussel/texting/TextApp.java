package be.intecbrussel.texting;

public class TextApp {
    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("Ja, een mooie lange zin voor jou alstublief.");

        // Manier 1
        WordFilter wordFilter = new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.length() < 4;
            }
        };

        tp.printFilteredWords(wordFilter);


        // Manier 2
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String word) {
                int amountOfCharactersMax = 4;
                int amountOfCharactersInWord = word.length();
                boolean b = amountOfCharactersInWord < amountOfCharactersMax;
                return b;
            }
        });





        // Manier lambda | Only possible with functional interfaces
//        WordFilter wordFilter2 = (word) -> word.length() < 4;
        WordFilter wordFilter2 = (word) -> isWordSmallerThanFourCharacters(word);


        tp.printFilteredWords(wordFilter2);
    }

    private static boolean isWordSmallerThanFourCharacters(String word) {
        int amountOfCharactersMax = 4;
        int amountOfCharactersInWord = word.length();
        boolean b = amountOfCharactersInWord < amountOfCharactersMax;
        return b;
    }
}
