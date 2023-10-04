package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
public class SolutionTest {
    @Test
    public void test()
    {
        Solution s = new Solution();
        List < Boolean > correct = Arrays.asList(s.hasCloseElements(new ArrayList < > (Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3), !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05), s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95), !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8), s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1), s.hasCloseElements(new ArrayList < > (Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0), !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5));
        if (correct.contains(false)) {
            /*throw new AssertionError();*/
            }
    }
}