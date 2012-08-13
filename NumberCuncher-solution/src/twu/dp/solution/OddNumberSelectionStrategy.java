package twu.dp.solution;

public class OddNumberSelectionStrategy implements NumberSelectionStrategy {
    @Override
    public boolean isAcceptable(int number) {
        return number % 2 == 1;
    }
}
