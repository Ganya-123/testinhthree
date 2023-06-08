package assignmenttwo;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = getAllPermutations(arr);

        for (List<Integer> i : list) {
            System.out.println(i);
        }
    }

    public static List<List<Integer>> getAllPermutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutation(nums, 0, ans);
        return ans;
    }

    private static void swapElements(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    private static void generatePermutation(int[] nums, int index, List<List<Integer>> ans) {
        if (index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swapElements(nums, index, i);
            generatePermutation(nums, index + 1, ans);
            swapElements(nums, index, i);
        }
    }
}