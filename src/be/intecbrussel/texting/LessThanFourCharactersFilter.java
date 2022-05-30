package be.intecbrussel.texting;

public class LessThanFourCharactersFilter implements WordFilter{
    @Override
    public boolean isValid(String word) {
        return word.length() < 4;
    }
}
