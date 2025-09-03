import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while(num != 0){
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}
