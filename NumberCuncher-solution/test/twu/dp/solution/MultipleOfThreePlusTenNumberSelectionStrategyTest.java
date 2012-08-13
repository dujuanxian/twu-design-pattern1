package twu.dp.solution;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultipleOfThreePlusTenNumberSelectionStrategyTest {
    @Test
    public void shouldAcceptTwo() {
        assertThat(new MultipleOfThreePlusTenNumberSelectionStrategy().isAcceptable(2), is(true));
    }

    @Test
    public void shouldRejectThree() {
        assertThat(new MultipleOfThreePlusTenNumberSelectionStrategy().isAcceptable(3), is(false));
    }

    @Test
    public void shouldRejectFour() {
        assertThat(new MultipleOfThreePlusTenNumberSelectionStrategy().isAcceptable(4), is(false));
    }

    @Test
    public void shouldAcceptFive() {
        assertThat(new MultipleOfThreePlusTenNumberSelectionStrategy().isAcceptable(5), is(true));
    }

    @Test
    public void shouldRejectSix() {
        assertThat(new MultipleOfThreePlusTenNumberSelectionStrategy().isAcceptable(6), is(false));
    }

}
