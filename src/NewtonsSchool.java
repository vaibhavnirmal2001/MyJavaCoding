import java.util.Scanner;

public class NewtonsSchool {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if (n%3==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
