public class Grayscale {
	public static final int BLACK = 0;
	public static final int WHITE = 255;
	/**
	 * The 2-dimensional representation of this image. Guaranteed not to be
	 * null. All values in the array are within the range [BLACK, WHITE],
	 * inclusive.
	 */
	private int[][] pixelValues;

	/**
	 * @return the total number of white pixels in this image. Postcondition:
	 *         this image has not been changed.
	 */
	public int countWhitePixels() {
		int whitePixels = 0;
		for (int i = 0; i < pixelValues.length; i++) {
			for (int j = 0; j < pixelValues.length; j++) {
				if (pixelValues[i][j] == 255) {
					whitePixels++;
				}
			}
		}
		return whitePixels;
	}

	/**
	 * Processes this image in row-major order and decreases the value of each
	 * pixel at position (row, col) by the value of the pixel at position (row +
	 * 2, col + 2) if it exists. Resulting values that would be less than BLACK
	 * are replaced by BLACK. Pixels for which there is no pixel at position
	 * (row + 2, col + 2) are unchanged.
	 */
	public void processImage() {
		/* to be implemented in part (b) */ }
}
