package be.intecbrussel.texting;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String word);
}
