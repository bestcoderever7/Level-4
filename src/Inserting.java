import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Inserting {

	public static int[] insert(int[] array, int i) {
		// TODO Auto-generated method stub
		int[] sorted = new int[array.length + 1];
		int index = 0;
		boolean indexFound = false;
		for (int j : array) {
			if (indexFound == true) {
				sorted[index] = j;
			} else {
				if (j < i) {
					sorted[index] = j;
				} else if (j > i || j == i) {
					if (indexFound == false) {
						sorted[index] = i;
						index++;
						indexFound = true;
					}
					sorted[index] = j;
				}
			}
			index++;
		}
		for (int j : sorted) {
			System.out.println(j + " ");
		}
		System.out.println("\n");
		return sorted;
	}
}
