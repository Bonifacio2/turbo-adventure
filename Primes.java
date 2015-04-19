import java.util.ArrayList;

/**
 * Created by bonifacio on 4/19/15.
 */
public class Primes {

    public static void main(String[] args){

        int n = 0;

        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e){
            System.err.println("Invalid diamondSize");
        }

        Primes primes = new Primes();

        System.out.println(primes.generate(n));
    }

    private ArrayList<Integer> generate(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int prime: primesSmallerThan(n)){
            if ((n % prime) == 0){
                factors.add(prime);
            }
        }

        return factors;
    }

    private ArrayList<Integer> primesSmallerThan(int n){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }

        return  primes;
    }

    private boolean isPrime(int n){
        boolean isPrime = true;

        if (n < 2){
            return false;
        }

        if (n == 2){
            return true;
        }

        for (int i = 3; i < n; i++){
            if ((n % i) == 0){
                return false;
            }
        }

        return isPrime;
    }
}
