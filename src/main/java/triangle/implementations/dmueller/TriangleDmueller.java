package triangle.implementations.dmueller;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleDmueller implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
