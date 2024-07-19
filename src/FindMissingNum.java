import java.util.Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int missingNum = findMissingInt(arr);
        System.out.println("Missing number: " + missingNum);

        int[] newArr = consecutiveInsert(arr, missingNum);
        System.out.println("New array: " + Arrays.toString(newArr));
    }
    public static int findMissingInt(int[] arr) {
        // Complete the method as described.
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if(arr[i + 1] - arr[i] > 1){
                return arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 1] + 1;
    }
    public static int[] consecutiveInsert(int[] arr, int missingNum) {
        // Complete the method as described.
        int[] result = new int[arr.length + 1];
        int i = 0, j = 0;
        boolean inserted = false;
        boolean isSorted = false;
        Arrays.sort(result);
        if(isAscending(result)) {
            isSorted = true;
        } else {
            Arrays.sort(result);
        }


        while (i < arr.length) {
            if (!inserted && arr[i] < missingNum) {
                result[j] = missingNum;
                inserted = true;
                j++;
            } else {
                result[j] = arr[i];
                i++;
                j++;
            }
        }


        if(!inserted){
            result[j] = missingNum;

        }

        System.out.println(Arrays.toString(result));
        return result;
    }
    private static boolean isAscending(int[] arr) {
        return arr[0] < arr[1];
    }
}
