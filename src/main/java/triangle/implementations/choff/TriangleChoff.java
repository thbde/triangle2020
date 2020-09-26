package triangle.implementations.choff;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleChoff implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
