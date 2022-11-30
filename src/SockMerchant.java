import java.util.*;

public class SockMerchant {
    public static int sockMerchant(int n, List<Integer> al) {
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer x: al){
            if (hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else {
                hm.put(x,1);
            }
        }
        for(Integer x: hm.values()){
            count+=x/2;
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
