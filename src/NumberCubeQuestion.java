import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumberCubeQuestion {

	public static int[] toss(int tosses) {
		int[] nums = new int[tosses];
		for (int i = 0; i < tosses; i++) {
			boolean breakOut = false;
			while (breakOut == false) {
				nums[i] = new Random().nextInt(6);
				if (nums[i] != 0) {
					breakOut = true;
				}
			}
		}
		return nums;
	}

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
				if (currentLength > longestLength) {
					longestIndex = i - currentLength;
					if (testValues.length < 3) {
						longestIndex++;
					}
				}
			} else {
				if (currentLength > longestLength) {
					longestIndex = i - currentLength;
					longestLength = currentLength;
				}
				// System.out.println("\n" + i + " - " + currentLength + " = " +
				// longestIndex + "\n");

				currentLength = 1;
			}
			// System.out.println(currentNum + " " + testValues[i] + " " +
			// currentLength + " " + "(" + longestLength +
			// ")");
			currentNum = testValues[i];
		}
		return longestIndex;
	}

	public static void answerQuestions(int[] die1, int[] die2) {
		// TODO Auto-generated method stub
		int[] die3 = new int[6];
		for (int i = 0; i < 6; i++) {
			die3[i] = die1[i] + die2[i];
		}
		int[] numValues = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println(die3[i] - 2);
			numValues[die3[i] - 2]++;
		}
		int greatest = 2;
		int least = 2;
		for (int i = 0; i < 6; i++) {
			if (numValues[i] > numValues[greatest]) {
				greatest = i + 2;
			}
			if (numValues[i] < numValues[least]) {
				least = i + 2;
			}
		}
		System.out.println("1. " + greatest + "2. " + least + "3. " + Arrays.toString(numValues));
	}

}
