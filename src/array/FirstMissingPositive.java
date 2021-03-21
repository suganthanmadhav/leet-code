package array;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            while (curr - 1 >= 0 && curr - 1 < nums.length && curr != nums[curr - 1]) {
                int next = nums[curr - 1];
                nums[curr - 1] = curr;
                curr = next;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;
    }
}
