package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        if(nums.length == 0){
            List<List<Integer>> none = new ArrayList<>();
            return none;
        }
        List<List<Integer>> answer = new ArrayList<>();

        return answer;
    }
    public static void printList(List<List<Integer>> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

}
