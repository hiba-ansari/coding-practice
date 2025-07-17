package exercism.medium;

import java.util.ArrayList;

/*
Determine if a word or phrase is an isogram.
An isogram (also known as a "non-pattern word") is a word or phrase without a repeating letter, however spaces and
hyphens are allowed to appear multiple times.

Examples of isograms:
lumberjacks
background
downstream
six-year-old

The word isograms, however, is not an isogram, because the s repeats.
 */
public class IsogramChecker {
    boolean isIsogram(String phrase) {
        phrase = phrase.trim().toLowerCase().
                replace(" ", "").
                replace("-", "");
        ArrayList<Character> knownChars = new ArrayList<>();

        if (phrase.isEmpty() || phrase.length() == 1) return true;
        else {
            for (int i = 1; i < phrase.length(); i++) {
                knownChars.add(phrase.charAt(i-1));
                if (knownChars.contains(phrase.charAt(i))) return false;
                else knownChars.add(phrase.charAt(i));
            }
            return true;
        }
    }

    public static void main(String[] args) {
        IsogramChecker checker = new IsogramChecker();
        System.out.println(checker.isIsogram("six-year-old"));
    }
}
