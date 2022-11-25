import java.util.*;

public class maxScore {
    public static int maxScore(String s) {
        int zeros = 0, ones = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '0') zeros++; else ones++;
            if(i != s.length()-1) max = Math.max(zeros - ones, max);
        }
        return max + ones;
    }

    public static int powerfulSubArray(int[] A) {
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        int res = 0, degree = 0;
        for (int i = 0; i < A.length; ++i) {
            first.putIfAbsent(A[i], i);
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
            if (count.get(A[i]) > degree) {
                degree = count.get(A[i]);
                res = i - first.get(A[i]) + 1;
            } else if (count.get(A[i]) == degree)
                res = Math.min(res, i - first.get(A[i]) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(maxScore("101"));
        System.out.println(powerfulSubArray(new int[]{1,4,3,4,2}));
    }
}
