import java.util.*;

public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            ans.add(a.get((i+d)%a.size()));
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(rotLeft(al,4));
    }

}
