package testLearning;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTesterTest {
	@Test
	public void lazyTrim() {
		String input = "abc";
		String expected = "abc";
		String actual = StringUtilsTester.lazyTrim(input);

		assertEquals(expected, actual);
	}
}
