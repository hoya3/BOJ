import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt(); //총 금액
        int N = input.nextInt(); //종류 수
        int total = 0;
        for(int i =0; i < N;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            total += a*b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}