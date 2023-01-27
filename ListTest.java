import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class Rules implements StringChecker {
    public boolean checkString(String s) {
        if(s.length() > 3) {
            return false;
        }
        return true;
    }
}

public class ListTest {
	@Test 
	public void testFilter() {
    List<String> list = new ArrayList<>();
    list.add("0");
    list.add("123");
    list.add("4567");
    list.add("89");
    Rules rule1 = new Rules();
    List<String> result = ListExamples.filter(list, rule1);
    List<String> expected = new ArrayList<>();
    expected.add("0");
    expected.add("123");
    expected.add("89");
    assertEquals(expected, result);
	}

    @Test 
	public void testMerge() {
    List<String> list1 = new ArrayList<>();
    list1.add("a");
    list1.add("c");
    List<String> list2 = new ArrayList<>();
    list2.add("b");
    list2.add("d");
    list2.add("e");
    List<String> result = ListExamples.merge(list1, list2);
    List<String> expected = new ArrayList<>();
    expected.add("a");
    expected.add("b");
    expected.add("c");
    expected.add("d");
    expected.add("e");
    assertEquals(expected, result);
	}
}