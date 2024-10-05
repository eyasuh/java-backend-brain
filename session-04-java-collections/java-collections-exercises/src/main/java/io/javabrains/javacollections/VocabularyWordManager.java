package io.javabrains.javacollections;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {
    SortedSet<String> vocabulary;
    public VocabularyWordManager(Collection<String> words) {
        vocabulary = new TreeSet<>(words);
//        throw new RuntimeException("Not implemented");
    }

    public String getFirstWord() {
//        throw new RuntimeException("Not implemented");
        return vocabulary.first();
    }

    public String getLastWord() {
        return vocabulary.last();

    }

    public SortedSet<String> getWordsBefore(String word) {
        return vocabulary.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
        return vocabulary.tailSet(word);
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
        return vocabulary.subSet(startWord, endWord);
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}
