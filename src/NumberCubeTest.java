import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCubeTest {

	/* READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf Try to answer on paper.
*/

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues = NumberCubeQuestion.toss(2);
		NumberCubeQuestion.getLongestRun(testValues);
		int[] testValues2 = NumberCubeQuestion.toss(13);
		NumberCubeQuestion.getLongestRun(testValues2);
	}
	
	@Test
	public void testPartC()
	{
		int[] die1 = NumberCubeQuestion.toss(6);
		int[] die2 = NumberCubeQuestion.toss(6);
		NumberCubeQuestion.answerQuestions(die1, die2);
	}

}

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
}


