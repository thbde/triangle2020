package triangle.implementations.jwolf;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleJwolf implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
