import java.util.*;

public class JumpingOnCluods {
    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = -1;
        for (int i = 0; i < c.size(); i++) {
            jumps++;
            if (i + 2 < c.size() && c.get(i + 2) != 1) i++;
        }
        return jumps;
    }
}
