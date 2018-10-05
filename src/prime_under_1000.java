import java.util.Scanner;

public class prime_under_1000 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giới hạn trên của dãy số nguyên tố: ");
        int n = sc.nextInt();
        int index = 0;
        String s = "";
        System.out.println("Dãy số nguyên tố có giới hạn trên " + n + " là:");
        for ( int i = 0; i <= n; i ++){
            if (check_prime.isprime(i)){
                index++;
                System.out.println("Số nguyên tố thứ " +index + " là: " +i);
            }
        }
    }
}
