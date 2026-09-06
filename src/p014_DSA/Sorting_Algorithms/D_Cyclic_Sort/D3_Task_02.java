package p014_DSA.Sorting_Algorithms.D_Cyclic_Sort;
// Asked in Google
// Find the numbers that need to be replaced
public class D3_Task_02 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 2, 7, 8};
        findDisappearedNumbers(nums);
    }
    public static void findDisappearedNumbers(int[] nums) {
        int i = 0;
        // Cyclic Sort
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // Find the duplicate values
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                int oldValue = nums[index];
                int newValue = index + 1;
                System.out.println("Index = " + index +", Old Value = " + oldValue +", New Value = " + newValue);
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}