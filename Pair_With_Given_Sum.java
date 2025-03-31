import java.util.HashSet;

public class PairWithSum {
    public static boolean hasPairUsingHashSet(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;
        System.out.println("Pair found: " + hasPairUsingHashSet(arr, target));
    }
}
