public class Grayscale {
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	public static void main(String[] args) {
		Grayscale grayscale = new Grayscale();
		grayscale.createImage();
		//System.out.println(grayscale.pixelValues.length - 1);
		//System.out.println(grayscale.countWhitePixels());
		grayscale.processImage();
	}

	/**
	 * The 2-dimensional representation of this image. Guaranteed not to be
	 * null. All values in the array are within the range [BLACK, WHITE],
	 * inclusive.
	 */
	private int[][] pixelValues = new int[4][5];

	/**
	 * @return the total number of white pixels in this image. Postcondition:
	 *         this image has not been changed.
	 */
	public int countWhitePixels() {
		int whitePixels = 0;
		for (int i = 0; i < pixelValues.length; i++) {
			for (int j = 0; j < pixelValues.length; j++) {
				if (pixelValues[i][j] == WHITE) {
					whitePixels++;
				}
			}
		}
		return whitePixels;
	}

	public void createImage() {
		// 84 130 255 130 84
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] array3 = new int[5];
		int[] array4 = new int[5];
		array1[0] = 221;
		array1[1] = 184;
		array1[2] = 178;
		array1[3] = 84;
		array1[4] = 135;
		array2[0] = 84;
		array2[1] = 255;
		array2[2] = 255;
		array2[3] = 130;
		array2[4] = 84;
		array3[0] = 78;
		array3[1] = 255;
		array3[2] = 0;
		array3[3] = 0;
		array3[4] = 78;
		array4[0] = 84;
		array4[1] = 130;
		array4[2] = 225;
		array4[3] = 130;
		array4[4] = 84;
		pixelValues[0] = array1;
		pixelValues[1] = array2;
		pixelValues[2] = array3;
		pixelValues[3] = array4;
	}

	/**
	 * Processes this image in row-major order and decreases the value of each
	 * pixel at position (row, col) by the value of the pixel at position (row +
	 * 2, col + 2) if it exists. Resulting values that would be less than BLACK
	 * are replaced by BLACK. Pixels for which there is no pixel at position
	 * (row + 2, col + 2) are unchanged.
	 */
	public void processImage() {
		int i = 0;
		int currArray = 0;
		for (int j = 0; j < pixelValues.length; j++) {
			for (int value : pixelValues[j]) {
				//System.out.println((currArray + 2) + " < " + pixelValues.length);
				if (currArray + 2 < pixelValues.length) {
					if (i + 2 < pixelValues[currArray + 2].length) {
						pixelValues[currArray][i] = pixelValues[currArray][i] - pixelValues[currArray + 2][i + 2];
						if (pixelValues[currArray][i] < BLACK) {
							pixelValues[currArray][i] = BLACK;
						}
						//System.out.println(pixelValues[currArray][i]);
					}
				}
				//System.out.println((currArray + 2) + " < " + pixelValues.length + " (" + pixelValues[currArray][i] + ")");
				i++;
				if(i == 5)
				{
					i = 0;
				}
			}
			currArray++;
		}
		for (int j = 0; j < pixelValues.length; j++) {
			for (int value : pixelValues[j]) {
				System.out.println(value);
			}
		}
	}
}
