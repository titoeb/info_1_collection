// Geschrieben von Grzegorz Baran
public class Calculator {
    public static void main(String[] args) {

        // Die Eingabe soll folgende Form haben: Ziffer+Operator+Ziffer+Operator+....+Ziffer
        String input = args[0];

        // Die Anzahl der Zahlen
        int s = input.length() / 2 + 1;

        // Das Feld mit Werten wird initialisiert
        int[] values = new int[s];

        // Das erste Zeichen im String ist das erste Glied des Feldes
        values[0] = Character.getNumericValue(input.charAt(0));

        int k = 1; // Die Position des erstes Operators im String
        int i = 0; // Index des Feldes mit Werten

        while (k < input.length()) {

            // bei Multiplikation wird das aktuelle Glied aktualisiert
            if (input.charAt(k) == '*')
                values[i] *= Character.getNumericValue(input.charAt(k + 1));

            // bei Addition wird ein neues Element ins Feld hinzugefügt
            if (input.charAt(k) == '+') {
                values[i + 1] = Character.getNumericValue(input.charAt(k + 1));
                i++;
            }

            // bei Substraktion wird ein neues Element mit Minus ins Feld hinzugefügt
            if (input.charAt(k) == '-') {
                values[i + 1] = Character.getNumericValue(input.charAt(k + 1)) * (-1);
                i++;
            }

            // Sprung zum nächsten Operator
            k += 2;
        }

        // Berechnung der Summe bis values[i]; der Rest des Feldes ist leer
        for (int j = 1; j <= i; j++)
            values[0] += values[j];

        System.out.println(values[0]);

    }
}
