package exercism.easy;

/*
https://exercism.org/tracks/java/exercises/squeaky-clean/edit

Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading
and trailing spaces.
=============
Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.
=============
Modify the (static) SqueakyClean.clean() method to convert leetspeak to normal text.
For simplicity we will only be replacing 4, 3, 0, 1 and 7 with a, e, o, l, and t, respectively.
=============
Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.
 */
class SqueakyClean {
    static String clean(String identifier) {
        String cleanIdentifier = identifier.replace(" ", "_").trim();
        cleanIdentifier = cleanIdentifier.replace("4", "a");
        cleanIdentifier = cleanIdentifier.replace("3", "e");
        cleanIdentifier = cleanIdentifier.replace("0", "o");
        cleanIdentifier = cleanIdentifier.replace("1", "l");
        cleanIdentifier = cleanIdentifier.replace("7", "t");
        StringBuilder sb = new StringBuilder();
        boolean doUpperCase = false;

        for (int i = 0; i < cleanIdentifier.length(); i++) {
            char currChar = cleanIdentifier.charAt(i);
            if (doUpperCase)
                currChar = Character.toUpperCase(currChar);
            if (currChar == '-') {
                doUpperCase = true;
            }
            else if (!Character.isLetter(currChar)) {
                doUpperCase = false;
                if (currChar == '_') {
                    sb.append(currChar);
                }
            }
            else {
                doUpperCase = false;
                sb.append(currChar);
            }
        }

        return sb.toString();
    }
}


