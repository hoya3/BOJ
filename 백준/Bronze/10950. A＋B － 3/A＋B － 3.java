import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int arr[] = new int[cnt];

        for(int i=0;i<cnt;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i]=a+b;
        }
        for(int k:arr) {
            System.out.println(k);
        }
    }
}
