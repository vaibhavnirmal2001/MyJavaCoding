public class CountSubArrays {
    long countSubarray(int arr[], int n, int k) {
        long count=0;
        long lessSubarray=0;
        long totalSubarray = calculate(n);
        for(int i=0; i<n; i++){
            if(arr[i]<=k){
                count = count+1;
            }
            else{
                lessSubarray += calculate(count);
                count=0;
            }
        }
        if(count!=0){
            lessSubarray += calculate(count);
        }
        return totalSubarray - lessSubarray;
    }
    //Since n*(n+1) can be very large value, hence n*(n+1)/2 will have negative value in that cases. Therefore first dividing the even number out of 'n' and 'n+1' by 2 then multiply.
    long calculate(long count){
        if(count%2==0){
            return (count/2) * (count+1);
        }
        return (count+1)/2 * count;
    }
}
