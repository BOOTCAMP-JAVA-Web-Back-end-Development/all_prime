public class check_prime {
    public static boolean  isprime(int n){
        boolean res = false;
        if( n < 2){
            res = false;
        }
        else if ( n == 2 || n == 3){
            res = true;
        }
        else{
            for ( int i = 2; i < n/2; i ++){
               if( n % i == 0){
                   res = false;
                   break;
               }
               else{
                   res = true;
               }

            }
        }
        return res;
    }
}
