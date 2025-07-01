package exercism.easy;

import java.util.ArrayList;
import java.util.List;

/*
https://exercism.org/tracks/java/exercises/karls-languages/edit

Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new
languages, remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to
learn Java or Kotlin!
 */
public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if (languages.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        if (languages.contains(language)) {
            languages.remove(language);
        }
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}

