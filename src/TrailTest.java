import junit.framework.TestCase;

public class TrailTest extends TestCase {
	/*
	 * First try this question on paper, then use these unit tests to verify your answer. It starts on page 7.
	 * http://apcentral.collegeboard.com/apc/public/repository/ap10_frq_computer_science_a.pdf
	 */

	public void testIsLevelTrailSegment() {
		int[] markers = { 0, 160, 100, 60, 45, 50, 20, 75, 75, 70, 80, 120, 130 };
		Trail trail = new Trail();
		assertTrue(trail.isLevelTrailSegment(7, 10, markers));
	}

	public void testNonLevelTrailSegment() {
		int[] markers = { 50, 10, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 };
		Trail trail = new Trail();
		assertFalse(trail.isLevelTrailSegment(2, 12, markers));
	}

	public void testIsDifficult() {
		int[] markers = { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 };
		Trail trail = new Trail();
		assertTrue(trail.isDifficult(markers));
	}

	public void testIsNotDifficult() {
		int[] markers = { 30, 50, 40, 100, 20, 35, 60, 60, 60 };
		Trail trail = new Trail();
		assertFalse(trail.isDifficult(markers));
	}
}