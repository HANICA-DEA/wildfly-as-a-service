package nl.han.dea;

public class ParallelFizzBuzzer implements Runnable {

    private FizzBuzzCollector fbCollector;

    private FizzBuzzer fb;

    // public ParallelFizzBuzzer() {
    // }

    public ParallelFizzBuzzer(FizzBuzzCollector fbCollector, FizzBuzzer fb) {
        this.fbCollector = fbCollector;
        this.fb = fb;
    }

    public void fizzbuzz() {
        while(!fbCollector.isDone()) {
            var valueToFizzbuzz = fbCollector.getCounter();
            String fizzBuzzedValue = fb.fizzbuzz(valueToFizzbuzz);
            fbCollector.addOutput(new FizzBuzzCalculation(valueToFizzbuzz, fizzBuzzedValue, Thread.currentThread().getId()));
        }
    }

    @Override
    public void run() {
        fizzbuzz();
    }

}
