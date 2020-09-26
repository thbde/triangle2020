package triangle.implementations.cjost;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleCjost implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
