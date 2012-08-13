package twu.dp.solution;

public class MultipleOfThreePlusTenNumberSelectionStrategy implements NumberSelectionStrategy {
    @Override
    public boolean isAcceptable(int number) {
        return (number + 10) % 3 == 0;
    }
}
