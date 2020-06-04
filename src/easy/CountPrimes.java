package easy;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(new CountPrimes().countPrimes(n));

    }

    public int countPrimes(int n) {
        // int count = 0;
        boolean[] primes = new boolean[n];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;

        }

        for (int i = 2; i * i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i; j * i < primes.length; j++) {
                    primes[j * i] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                primeCount++;

            }
        }

        return primeCount;

    }

}