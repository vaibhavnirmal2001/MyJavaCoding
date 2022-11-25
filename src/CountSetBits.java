public class CountSetBits {
/*
    static long count(long n){
        String s= Long.toBinaryString(n);
        long num=Long.parseLong(s);
        int count=0;
        while (num>0){
            long rem=num%10;
            if (rem == 1) count++;
            num/=10;
        }
        int total=0;
        for (long i = 0; i < n; i++) {
            if (check(i)==count) total++;
        }
        return total;
    }
    private static int check(long n){
        int count=0;

        String s= Long.toBinaryString(n);
        long num=Long.parseLong(s);

        while (num>0){
            long rem=num%10;
            if (rem == 1) count++;
            num/=10;
        }
        return count;
    }
*/

    static long count(long n) {

        long result = 0;
        int setBits = 0;
        for (int i = 0; i < 64; i++) {
            if ((n & 1) == 1) {
                setBits++;
                long csb_res = csb(i, setBits);
                result = result + csb_res;
            }
            n = n >> 1;
        }
        return result;
    }
    public static long csb(long n, long k) {
        if (n == 0 || n < k)return 0;
        long result = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(count(8));
    }
}
