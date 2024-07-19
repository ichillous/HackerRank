import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        simpleArrSum(new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 10, 11)
        ));
    }
    public static int simpleArrSum(List<Integer> ar) {
        // Write your code here
        ar = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 10, 11)
        );
        int sum = 0;
        int i;
        int j;
        for (i = 0; i < ar.size(); i++) {

            sum += ar.get(i);
        }
        
        System.out.println(sum);
        return sum;
    }
}
