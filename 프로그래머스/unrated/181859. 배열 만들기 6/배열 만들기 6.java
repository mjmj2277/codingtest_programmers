import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0) {
                list.add(arr[i]);
            } else {
                if (list.get(list.size() - 1) == arr[i]) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(arr[i]);
                }
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
