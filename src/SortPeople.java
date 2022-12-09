import java.util.ArrayList;
import java.util.Arrays;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        ArrayList<Integer> al = new ArrayList<>();
        for (Integer x: heights) al.add(x);
        Arrays.sort(heights);

        String[] ans= new String[names.length];

        for (int i = heights.length-1,j=0; i >=0 ; i--,j++) {
            ans[j]=names[al.indexOf(heights[i])];
        }
        return ans;


    }

    public static void main(String[] args) {
        String[] names = new String[]{"Mary","John","Emma"};
        int[] heights = new int[]{180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));

    }
}
