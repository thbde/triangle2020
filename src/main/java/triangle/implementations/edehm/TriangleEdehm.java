package triangle.implementations.edehm;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleEdehm implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		if (lengths == null) {
			return TriangleResult.UNKNOWN;
		}
		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];

		if ( a <= 0 || b <= 0 || c <= 0) {
			return TriangleResult.UNKNOWN;
		}
		else if (a == b && b == c && a ==c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		else if (a == b || b == c || c == a) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		else {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
	}

	public TriangleResult getTriangleResultForLengths(int a, int b, int c) {
		
		if (a == b && b == c && a ==c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		else if (a == b || b == c || c == a) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		else {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
	}

}
