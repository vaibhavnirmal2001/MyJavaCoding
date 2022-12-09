import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencySort {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue <Character> pq = new PriorityQueue((a,b) -> map.get(b) - map.get(a));
        for (char c : map.keySet()) {
            pq.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("Tree"));
    }
}
