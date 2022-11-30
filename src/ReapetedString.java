public class ReapetedString {
    public static long repeatedString(String s, long n) {

        long a=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                a++;
            }
        }
        a=a*(n/s.length());
        for(int i=0; i<n%s.length(); i++){
            if(s.charAt(i)=='a'){
                a++;
            }
        }
        return a;


    }

    public static void main(String[] args) {
        System.out.println(repeatedString("a",5));
    }


}
