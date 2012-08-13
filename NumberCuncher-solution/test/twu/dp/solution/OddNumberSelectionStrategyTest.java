package twu.dp.solution;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OddNumberSelectionStrategyTest {
    @Test
    public void shouldAcceptOddNumber() {
        assertThat(new OddNumberSelectionStrategy().isAcceptable(3), is(true));
    }

    @Test
    public void shouldRejectEvenNumber() {
        assertThat(new OddNumberSelectionStrategy().isAcceptable(6), is(false));
    }

}
