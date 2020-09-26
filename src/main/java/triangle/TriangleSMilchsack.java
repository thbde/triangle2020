package triangle;

public class TriangleSMilchsack implements Triangle
{
	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths)
	{
		// Improved
		if (lengths == null || lengths.length < 3 || lengths.length > 3)
		{
			return TriangleResult.UNKNOWN;
		}

		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];

		// Added
		if (a <= 0 || b <= 0 || c <= 0)
		{
			return TriangleResult.UNKNOWN;
		}

		// Added
		if (a >= (b + c) || c >= (b + a) || b >= (a + c))
		{
			return TriangleResult.UNKNOWN;
		}

		if (a == b && b == c)
		{
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}

		// Edit
		if (a == b || b == c || a == c) 
		{
			return TriangleResult.TRIANGLE_ISOSCELES;
		}

		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}
}