public class prime_under_1000 {
    public static void main(String[] args){
        int index = 0;
        String s = "";
        for ( int i = 0; i <= 1000; i ++){
            if (check_prime.isprime(i)){
                index++;
                System.out.println("Số nguyên tố thứ " +index + " là: " +i);
            }
        }
    }
}
