package twu.dp.solution;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EvenNumberSelectionStrategyTest {
    @Test
    public void shouldAcceptEvenNumber() {
        assertThat(new EvenNumberSelectionStrategy().isAcceptable(4), is(true));
    }

    @Test
    public void shouldRejectOddNumber() {
        assertThat(new EvenNumberSelectionStrategy().isAcceptable(7), is(false));
    }

}
