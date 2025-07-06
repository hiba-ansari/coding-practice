package exercism.medium;

import java.util.ArrayList;
import java.util.List;

public class DiamondPrinterDS {

    public List<String> printToList(char letter) {
        List<String> diamond = new ArrayList<>();
        letter = Character.toUpperCase(letter);
        
        if (letter < 'A' || letter > 'Z') {
            diamond.add("A");
            return diamond;
        }

        int size = letter - 'A';
        int diamondSize = 2 * size + 1;

        // Build top half including middle
        for (int i = 0; i <= size; i++) {
            diamond.add(buildLine(size, i));
        }

        // Build bottom half (excluding middle)
        for (int i = size - 1; i >= 0; i--) {
            diamond.add(buildLine(size, i));
        }

        return diamond;
    }

    private String buildLine(int size, int currentRow) {
        char currentChar = (char) ('A' + currentRow);
        int outerSpaces = size - currentRow;
        int innerSpaces = 2 * currentRow - 1;

        StringBuilder line = new StringBuilder();

        // Leading spaces
        for (int i = 0; i < outerSpaces; i++) {
            line.append(' ');
        }

        // First character
        line.append(currentChar);

        // Inner spaces and second character (if not 'A')
        if (currentChar != 'A') {
            for (int i = 0; i < innerSpaces; i++) {
                line.append(' ');
            }
            line.append(currentChar);
        }

        // Trailing spaces
        for (int i = 0; i < outerSpaces; i++) {
            line.append(' ');
        }

        return line.toString();
    }

    public static void main(String[] args) {
        DiamondPrinter printer = new DiamondPrinter();
        
        System.out.println("Diamond for 'A':");
        List<String> aDiamond = printer.printToList('A');
        aDiamond.forEach(System.out::println);
        
        System.out.println("\nDiamond for 'C':");
        List<String> cDiamond = printer.printToList('C');
        cDiamond.forEach(System.out::println);
        
        System.out.println("\nDiamond for 'E':");
        List<String> eDiamond = printer.printToList('E');
        eDiamond.forEach(System.out::println);
    }
}