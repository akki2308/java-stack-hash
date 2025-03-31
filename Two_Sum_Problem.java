import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumUsingHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }
            
            map.put(arr[i], i);
        }
        
        return new int[]{-1, -1}; // If no solution is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumUsingHashMap(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
