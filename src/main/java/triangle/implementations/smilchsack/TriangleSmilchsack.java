package triangle.implementations.smilchsack;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleSmilchsack implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
