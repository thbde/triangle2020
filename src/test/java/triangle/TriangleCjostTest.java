package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import triangle.implementations.cjost.TriangleCjost;
import triangle.Triangle;

public class TriangleCjostTest {

	public static final Triangle triangle = new TriangleCjost();

	@Test
	public void testGetTriangleResultForLengthsNotEqual() {
		final int[] input = { 5, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqualVariables() {
		final int a = 5;
		final int b = 6;
		final int c = 7;
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsNotEqual2() {
		final int[] input = { 50, 70, 90 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles() {
		final int[] input = { 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsIsosceles2() {
		final int[] input = { 50, 50, 80 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral() {
		final int[] input = { 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLengthsEquiliteral2() {
		final int[] input = { 42, 42, 42 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	
	/**
	 * Hier wird getestet wie die implementation mit einer Länge von 0,0,0 umgeht
	 * --> Test in Ordnung!
	 */
	
	@Test
	public void testGetTriangleZeroLengths(){
		final int[] input = { 0, 0, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	/**
	 * Hier wird getestet wie die implementation mit einer Länge von 0,0,0 und negativen Werten umgeht
	 * --> Test: in Ordnung!
	 */
	
	@Test
	public void testGetTriangleNegativLengths(){
		final int[] input = { 1, -5, 3 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	/**
	 * Es wir Getestet ob ein gleichschenkliges Dreieck erkannt wird
	 * Test: in Ordnung!
	 */
	@Test
	public void testIsoseclesTriangle1(){
		final int[] input = {3,3,6};
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	/**
	 * Es wir Getestet ob ein gleichschenkliges Dreieck erkannt wird
	 * Test: in Ordnung!
	 */
	@Test
	public void testIsoseclesTriangle2(){
		final int[] input = {3,6,3};
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}

	/**
	 * Es wir Getestet ob ein gleichschenkliges Dreieck erkannt wird
	 * Test: in Ordnung!
	 */
	@Test
	public void testIsoseclesTriangle3(){
		final int[] input = {6,3,3};
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}


	/**
	 * Es wird getestet, ob ein gleichseitiges Dreieck erkannt wird
	 */
	@Test
	public void testEquilateralTriangle(){
		final int[] input = { 5, 5, 5};
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
	}
	
	/**
	 * Es wird getestet was passiert wenn Charakter übergeben werden
	 */
	@Test
	public void testCharakterInput(){
		final int[] input = {abc};
		final TriangleResult expected = TriangleResult.UNKNOWN;
		final TriangleResult result = triangle.getTriangleResultForLengths(input);
		assertThat(result).isEqualTo(expected);
		
	}

}
