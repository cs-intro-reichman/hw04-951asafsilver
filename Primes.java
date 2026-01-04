public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        
        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }

        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        int j = 2;
        while (j <= n) {
            if (isPrime[j]) {
                System.out.println(j);
                count++;
            }
            j++;
        }

        int percent = (int) (((double) count / n) * 100);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}