import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String X = A.toLowerCase();
        int r = X.length() - 1;

        String result = "";
        for (int i = 0; i < X.length(); i++){
            result = X.charAt(i) == X.charAt(r) ? "Yes" : "No";
            r--;
        }
        System.out.println(result);
        sc.close();
    }
}
