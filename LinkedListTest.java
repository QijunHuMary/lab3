import static org.junit.Assert.*;

//import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.*;

public class LinkedListTest {
	@Test 
	public void testFilter() {
    List<Integer> expected = new LinkedList<Integer>();
    expected.add(1);
    expected.add(2);
    MyLinkedList a = new MyLinkedList();
    a.append(1);
    a.append(2);
    assertEquals(expected, a);
    assertEquals((int)expected.get(0), a.first());
    assertEquals((int)expected.get(1), a.root.next.value);
	}
}