package nl.han.dea;

import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        var input = List.of("Jan", "Jansen", "Henk", "van den Tillaert");
        var stringHelpers = new StringHelpers();
        var output = stringHelpers.concatenatePairwise(input);
     
        if (args[0]!=null) {
            var max = Integer.parseInt(args[0]); 
        } else {
            max = 1000;
        }
        var fbPrinter = new FizzBuzzPrinter(max, 3, false);
        fbPrinter.printFizzbuzzNumbers();

        System.out.println(output);
    }

}
