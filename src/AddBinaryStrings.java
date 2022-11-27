public class AddBinaryStrings {
    static  String addBinary(String A, String B) {
        int n = A.length()-1, m = B.length()-1;
        int max = Math.max(n,m);
        int a1 = 0, b1 = 0, carry =0;
        StringBuilder sb = new StringBuilder();
        while(max>=0){
            if(n>=0 && A.charAt(n)=='1'){
                a1 = 1;
            }
            if(m>=0 && B.charAt(m)=='1'){
                b1 = 1;
            }

            if(a1+b1+carry == 3){
                sb.append("1");
            }
            else if(a1+b1+carry == 2){
                sb.append("0");
                carry = 1;
            }
            else if(a1+b1+carry==1){
                sb.append("1");
                carry = 0;
            }
            else if(a1+b1+carry==0){
                sb.append("0");
            }
            a1=0; b1 =0;
            n--;m--;max--;
        }
        if(carry ==1) sb.append("1");
        A = sb.reverse().toString();
        A = A.replaceAll("^0+", "");
        return A;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1101","111"));
    }
}
