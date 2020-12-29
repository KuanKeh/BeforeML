package leetcode.array;

import java.util.HashMap;
import java.util.Map;

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
    //test12
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = new TwoSum().twoSum(nums,target);

    }

    public int[] twoSum2(int[] num, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < num.length; i++){
            if(map.containsKey(num[i])){
                return new int[]{map.get(num[i]),i};
            }
            map.put(target - num[i], i);
        }
        return null;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int sum = 0;
        int more = 0;
        ListNode pre = dummy;

        while(l1 != null || l2 != null || more > 0){
            sum = (l1 ==null? 0 : l1.val) + (l2 == null? 0:l2.val) + more;
            more = sum / 10;
            sum = sum % 10;

            ListNode node = new ListNode(sum);
            pre.next = node;
            pre = node;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

        }
        return dummy.next;
    }
}
