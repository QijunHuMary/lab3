import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    //assertArrayEquals(new int[]{5, 2, 3}, input2);
    int[] expected = new int[]{5, 4, 3};
    //for(int i = 0; i < 3; i++) {
    //  assertEquals(expected[i], input2[i]);
    //}
    assertEquals(expected[0], input2[0]);
    assertEquals(expected[1], input2[1]);
    assertEquals(expected[2], input2[2]);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    // int[] input2 = {3, 4, 5};
    // assertArrayEquals(new int[]{5, 4, 3}, ArrayExamples.reversed(input2));
  }
}
