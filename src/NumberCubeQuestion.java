
public class NumberCubeQuestion {

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		// TODO Auto-generated method stub
		int[] tosses = new int[length];
		for (int i = 0; i < length; i++) {
			int j = numberCube.toss();
			tosses[i] = j;
		}
		return tosses;
	}

	public static Object getLongestRun(int[] testValues) {
		// TODO Auto-generated method stub
		int longestLength = 1;
		int longestIndex = -1;
		int currentLength = 1;
		int currentNum = testValues[0];
		for (int i = 1; i < testValues.length; i++) {
			if (currentNum == testValues[i]) {
				currentLength++;
				System.out.println(currentNum + " = " + testValues[i] + " (" + currentLength + ")");
				if (currentLength > longestLength) {
					longestLength = currentLength;
				}
			} else {
				if (currentLength > 1) {
					if (currentLength > longestLength) {
						longestIndex = i - currentLength;
					}
					// System.out.println("\n" + i + " - " + currentLength + " = " + longestIndex + "\n");
				}
				currentLength = 1;
			}
			// System.out.println(currentNum + " " + testValues[i] + " " + currentLength + " " + "(" + longestLength +
			// ")");
			currentNum = testValues[i];
		}
		System.out.println("\n");
		return longestIndex;
	}

}
