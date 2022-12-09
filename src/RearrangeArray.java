import java.util.Arrays;

public class RearrangeArray {
    public static void rearrange(long[] arr, int n){
        long[] temp= new long[n];
        for (int i = 0,j=n-1,k=0; i <= j; i++,j--) {
            if (i==j){
                temp[k]=arr[i];
                break;
            }
            temp[k++]=arr[j];

            temp[k++]=arr[i];

        }
        for (int i = 0; i < n; i++) {
            arr[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        long[] a= new long[]{10,20,30,40,50,60,70,80,90,100,110};
        rearrange(a,a.length);
        System.out.println(Arrays.toString(a));

    }
}
