import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 , 5 , 7 , 9 , 11 , 13 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 13, 11, 9, 7, 5, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = { 4, 4, 4, 6, 6};
    assertEquals( 5.0 , ArrayExamples.averageWithoutLowest(input) , .001 );
  }
}
