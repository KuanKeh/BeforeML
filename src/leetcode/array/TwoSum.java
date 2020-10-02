package leetcode.array;

import java.util.Vector;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] vector = new int[2];
        int indice1 = -1;
        int indice2 = -1;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indice1 = i;
                    indice2 = j;
                    break;
                }
            }
            if (indice1 != -1)
                break;
        }
        if(indice1 != -1){
            vector[0] = indice1;
            vector[1] = indice2;
        }
        return vector;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = new TwoSum().twoSum(nums,target);

    }
}
