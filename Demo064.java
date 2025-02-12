public class Demo064 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 13 };
        int n = nums.length;
        int temp = nums[0];
        nums[0] = nums[n - 1];
        nums[n - 1] = temp;
        System.out.print("The swapping of the array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}