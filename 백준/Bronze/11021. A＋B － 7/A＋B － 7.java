import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; i <= N; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
        input.close();
    }
}