package triangle.implementations.mgross;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleMgross implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
