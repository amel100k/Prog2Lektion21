package opgave02;

import opgave02.primenumbers.PrimeFinder;
import opgave02.primenumbers.SieveOfEratosthenes;
import opgave02.primenumbers.Timer;

public class Opgave02 {
    public static void main(String[] args) {

        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        Timer timer1 = new Timer(sieve);
        timer1.findPrimeNumbersWithTimer(1000000);
        sieve.findPrimeNumbers(1000000);
    }
}
