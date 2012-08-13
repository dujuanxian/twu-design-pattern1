package twu.dp.solution;

public class EvenNumberSelectionStrategy implements NumberSelectionStrategy {
    @Override
    public boolean isAcceptable(int number) {
        return number % 2 == 0;
    }
}
