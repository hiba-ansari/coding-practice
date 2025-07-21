package codility.easy;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceByFiveTest {
    @Test
    public void test1() {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        String result = replaceByFive.solution("100000", 3);

        assertEquals("555000", result);
    }

    @Test
    public void test2() {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        String result = replaceByFive.solution("5567855", 5);

        assertEquals("IMPOSSIBLE", result);
    }

    @Test
    public void test3() {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        String result = replaceByFive.solution("000000", 10);

        assertEquals("IMPOSSIBLE", result);
    }

    @Test
    public void test4() {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        String result = replaceByFive.solution("55555", 3);

        assertEquals("IMPOSSIBLE", result);
    }

    @Test
    public void test5() {
        ReplaceByFive replaceByFive = new ReplaceByFive();
        String result = replaceByFive.solution("3", 3);

        assertEquals("IMPOSSIBLE", result);
    }
}
