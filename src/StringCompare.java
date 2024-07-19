import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        String smallest;
        String largest;
        int temp, size;
        char charArray[] = s.toCharArray();
        size = charArray.length;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(charArray[i]>charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
                }
            }
        }
        smallest = s.substring(s.length() - k);
        largest = s.substring(0, 3);

        System.out.println(smallest);
        System.out.println(largest);
    }
}
