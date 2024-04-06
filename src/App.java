import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = {5,0,1,2,3,4};
        Solution sl = new Solution();
        int[] ans =sl.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
