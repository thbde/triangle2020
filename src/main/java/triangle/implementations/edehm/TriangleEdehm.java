package triangle.implementations.edehm;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleEdehm implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
