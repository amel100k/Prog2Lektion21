package opgave02.primenumbers;

import java.time.Duration;
import java.time.Instant;

public class Timer extends PrimeFinder{
    private PrimeFinder primeFinder;
    public Timer(PrimeFinder primeFinder){
        this.primeFinder = primeFinder;
    }
    public void findPrimeNumbersWithTimer(int n){
        Instant start = Instant.now();
        primeFinder.findPrimeNumbers(n);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " ms.");
    }
}
