package testLearning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTesterTest{

    @Test
    public void lazyTrim1() {
        String input = null;
        String expected = "";
        String actual = StringUtilsTester.lazyTrim(input);

        assertEquals(expected, actual);
    }

    @Test
    public void lazyTrim2() {
        String input = "";
        String expected = "";
        String actual = StringUtilsTester.lazyTrim(input);

        assertEquals(expected, actual);
    }

    @Test
    public void lazyTrim3() {
        String input = " R";
        String expected = " R";
        String actual = StringUtilsTester.lazyTrim(input);

        assertEquals(expected, actual);
    }

    @Test
    public void lazyTrim4() {
        String input = "~";
        String expected = "~";
        String actual = StringUtilsTester.lazyTrim(input);

        assertEquals(expected, actual);
    }

    @Test
    public void lazyTrim5() {
        String input = " ";
        String expected = "";
        String actual = StringUtilsTester.lazyTrim(input);

        assertEquals(expected, actual);
    }
}