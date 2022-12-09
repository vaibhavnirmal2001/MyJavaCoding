import java.util.Scanner;

public class IshuTambi {

    static int IncresingSubarray(int n,int[] arr)
    {

        int pre[] = new int[n] ;
        int pos[] = new int[n] ;
        pre[0] = 1;
        pos[n - 1] = 1;
        int l = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                pre[i] = pre[i - 1] + 1;
            else
                pre[i] = 1;
        }

        l = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1])
                pos[i] = pos[i + 1] + 1;
            else
                pos[i] = 1;
        }

        int ans = 0;
        l = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                l++;
            } else {
                l = 1;
            }
            ans = Math.max(ans, l);
        }

        for (int i = 1; i <= n - 2; i++) {
            if (arr[i - 1] < arr[i + 1])
                ans = Math.max(pre[i - 1] + pos[i + 1], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(IncresingSubarray(n,a));

    }
}
