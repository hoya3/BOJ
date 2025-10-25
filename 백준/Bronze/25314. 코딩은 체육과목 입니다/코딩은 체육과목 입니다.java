import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        int cnt = input/4;

        for(int i = 0; i < cnt; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}