import java.util.Scanner;

public class ProjectEuler1 {
    public static long countSum(int n){
        int sum=0;
        for (int i = 1; i <n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(countSum(n));
        }
    }
}
