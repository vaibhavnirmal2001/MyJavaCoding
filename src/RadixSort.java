import java.util.*;

public class RadixSort {
    public static ArrayList<Integer> sortArray(ArrayList<Integer> nums) {

        int k = maxDigit(nums);
        for(int i = 0; i < k; i++) {

            List<List<Integer>> buckets = new ArrayList<>();
            for(int j = 0; j < 20; j++) {
                buckets.add(new ArrayList<>());
            }

            for(int j = 0; j < nums.size(); j++) {
                int currDigit = getDigit(nums.get(j), i);
                buckets.get(currDigit + 10).add(nums.get(j));
            }

            int numsIdx = 0;
            for(List<Integer> bucket: buckets) {
                for(int j = 0; j < bucket.size(); j++) {
                    nums.set(numsIdx++,bucket.get(j));
                }
            }
        }

        return nums;

    }

    /*
        PROBLEM: determine the number's digit at a given place
    */
    public static int getDigit(int number, int place) {

        return (int)(number / Math.pow(10,place)) % 10;
    }

    public static int maxDigit(ArrayList<Integer> numbers) {

        int maxDigits = 0;
        for(int number: numbers) {
            maxDigits = Math.max(maxDigits, digitCount(number));
        }
        return maxDigits;

    }

    public static int digitCount(int number) {

        number = Math.abs(number);
        return (int)Math.log10(number) + 1;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            ArrayList<Integer> al = new ArrayList<>();
            int x=sc.nextInt();
            while (x-->0) {
                int r= sc.nextInt();
                al.add(r);
            }

            sortArray(al);
            for (int i = 0; i < al.size(); i++) {
                if (i!=al.size()-1){
                    System.out.print(al.get(i)+" ");
                }else {
                    System.out.print(al.get(i));
                }
            }


    }
}
