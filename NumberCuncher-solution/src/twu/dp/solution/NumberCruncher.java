package twu.dp.solution;

public class NumberCruncher {
    private final NumberSelectionStrategy strategy;
    private final int[] numbers;

    public NumberCruncher(NumberSelectionStrategy strategy, int... numbers) {
        this.strategy = strategy;
        this.numbers = numbers;
    }

    public int count() {
        int counter = 0;
        for (int number : numbers) {
            if (strategy.isAcceptable(number)) {
                counter++;
            }
        }
        return counter;
    }
}
