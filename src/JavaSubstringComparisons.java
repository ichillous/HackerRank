

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        String x = "welcometojava";
        getSmallestAndLargest(x, 3);
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        StringBuilder wholeString = new StringBuilder();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        // KISS :-P
        // change
        int i;
        for (i = 0; i < s.length() -2 ; i++){ // iterate through every letter
            // for each i-k push those characters to a new string
            wholeString.append(s.substring(i, i+k));
            wholeString.append("\n");
        }

        System.out.println(wholeString);

        return smallest + "\n" + largest;
    }

}
