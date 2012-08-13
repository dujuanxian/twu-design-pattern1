package twu.dp.solution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class NumberCruncherTest {
    @Mock
    NumberSelectionStrategy strategy;

    @Test
    public void shouldCountNumbersBasedOnStrategy() {
        given(strategy.isAcceptable(anyInt())).willReturn(true, false, false, true, false);

        int count = new NumberCruncher(strategy, 1, 2, 3, 4, 5).count();

        assertThat(count, is(2));
    }
}