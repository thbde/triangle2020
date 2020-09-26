package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import triangle.implementations.smilchsack.TriangleSMilchsack;

public class TriangleSMilchsackTest
{

	public static final Triangle triangle = new TriangleSMilchsack(); // new TriangleFirstTry();

	@Test
	public void testGetTriangleResultForLengthsNotEqual()
	{
		final int[] input =
		{ 5, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqualVariables()
	{
		final int a = 5;
		final int b = 6;
		final int c = 7;
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
		assertThat(result).isEqualTo(expected);
	}

	// Removed
	/*
	 * @Test public void testGetTriangleResultForLengthsNotEqual2() { final int[]
	 * input = { 50, 70, 90 }; final TriangleResult expected =
	 * TriangleResult.TRIANGLE_NOT_EQUAL; final TriangleResult result =
	 * triangle.getTriangleResultForLengths(input);
	 * assertThat(result).isEqualTo(expected); }
	 */

	@Test
	public void testGetTriangleResultForLengthsIsosceles()
	{
		final int[] input =
		{ 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Changed
	@Test
	public void testGetTriangleResultForLengthsIsosceles2()
	{
		final int[] input =
		{ 80, 50, 50 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Added
	@Test
	public void testGetTriangleResultForLengthsIsosceles3()
	{
		final int[] input =
		{ 50, 80, 50 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Added
	@Test
	public void testGetTriangleResultForZeroValue()
	{
		final int[] input =
		{ 0, 50, 50 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Added
	@Test
	public void testGetTriangleResultForNegativeValue()
	{
		final int[] input =
		{ 50, -50, 50 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral()
	{
		final int[] input =
		{ 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Removed
	/*
	 * @Test public void testGetTriangleResultForLengthsEquiliteral2() { final int[]
	 * input = { 42, 42, 42 }; final TriangleResult expected =
	 * TriangleResult.TRIANGLE_EQUILATERAL; final TriangleResult result =
	 * triangle.getTriangleResultForLengths(input);
	 * assertThat(result).isEqualTo(expected); }
	 */

	// Added
	@Test
	public void testGetTriangleResultForLengthsNull()
	{
		assertThat(triangle.getTriangleResultForLengths(null)).isEqualTo(TriangleResult.UNKNOWN);
	}

	// Added
	@Test
	public void testGetTriangleResultForLengths2Values()
	{
		final int[] input =
		{ 42, 42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Added
	@Test
	public void testGetTriangleResultForLengths4Values()
	{
		final int[] input =
		{ 42, 42, 42, 42 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	// Added
	@Test
	public void testGetTriangleResult()
	{
		final int[] input =
		{ 1, 2, 50 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
}
