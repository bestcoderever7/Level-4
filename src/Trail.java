
public class Trail {

	public boolean isLevelTrailSegment(int i, int j, int[] markers) {
		// TODO Auto-generated method stub
		int maximum = 0;
		int minimum = 0;
		int current = 0;
		boolean first = true;
		for (int k = i; i < j; i++) {
			current = markers[i];
			if (first == true) {
				maximum = current;
				minimum = current;
			} else {
				if (current > maximum) {
					// System.out.println(current + " > " + maximum);
					maximum = current;
				} else if (current < minimum) {
					// System.out.println(current + " < " + minimum);
					minimum = current;
				}
			}
			first = false;
		}
		int difference = maximum - minimum;
		if (difference < 11) {
			return true;
		}
		return false;
	}

	public boolean isDifficult(int[] markers) {
		// TODO Auto-generated method stub
		int bigDiffs = 0;
		int prevNum = 0;
		int currNum = 0;
		int diff = 0;
		boolean first = true;
		for (int i = 0; i < markers.length; i++) {
			currNum = markers[i];
			if (first == false) {
				diff = currNum - prevNum;
				if (diff > 29 || diff < -29) {
					bigDiffs++;
				}
			}
			prevNum = currNum;
			first = false;
		}
		if (bigDiffs > 2) {
			return true;
		}
		return false;
	}

}
