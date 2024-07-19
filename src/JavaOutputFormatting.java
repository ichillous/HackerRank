import java.util.Arrays;
import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        arrayEx();
    }

    public static void arrayEx() {
        String[] arr = new String[]{"Jamal 333", "Bamal 23", "Jam 4"};
        String[] p = new String[arr.length];
        String space = " ";
        for (int i = 0; i < arr.length; i++) {
            String[] parts = arr[i].split(" ");
            if (parts.length != 2){
                throw new IllegalArgumentException("Each element must have a word and a number separated by a space");
            }
            String word = parts[0];
            String number = parts[1];

            // Pad the word part (including the space) to total length of 15
            String paddedWord = String.format("%-14s", word);

            // Pad the number with leading zeros to at least 3 digits
            String paddedNumber = String.format("%03d", Integer.parseInt(number));

            // Combine the padded word and number
            p[i] = paddedWord + " " + paddedNumber;
            }
        System.out.println(Arrays.toString(p));
        }
    }

