import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.tibco.dovetail.function.array;
import com.tibco.dovetail.function.string;


public class TestFunctions {
	
	@Test
	public  void test_string() {
		assertEquals("true", string.tostring(true));
		
		assertEquals("false", string.tostring(false));
		
		assertEquals("1", string.tostring(1));
		
		assertEquals("2", string.tostring(Long.valueOf(2)));
		
		assertEquals("3.3", string.tostring(3.3));
		
		assertEquals("4.3", string.tostring(Double.valueOf(4.3)));
		
		
		assertEquals("abc", string.concat("a", "b", "c"));
		
		assertEquals("abc", string.lowerCase("AbC"));
		
		assertEquals("ABC", string.upperCase("abC"));
	}

	@Test
	public void test_array() {
		assertEquals(Arrays.asList(1, 2, 3), array.create(1, 2, 3));
		
		assertEquals(Arrays.asList(1.1, 2, 3), array.create(1.1, 2, 3));
		
		assertEquals(Arrays.asList(1, 2.1, 3), array.create(1, 2.1, 3));
		
		assertEquals(Arrays.asList("1.1", "2", "3"), array.create("1.1", "2", "3"));
		
		assertEquals(Arrays.asList(true, false, true), array.create(true, false, true));
		
		assertEquals(true, array.contains(Arrays.asList(1, 2, 3), 2));
		
		assertEquals(true, array.contains(Arrays.asList("a", "b", "c"), "a"));

	}
}
