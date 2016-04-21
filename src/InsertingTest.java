import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class InsertingTest {
	@Test
	public void test() {
		// Inserting i = new Inserting();
		int[] array = { 1, 5, 6, 8, 9, 12 };
		int[] array2 = { 1, 3, 5, 6, 8, 9, 12 };
		assertArrayEquals(array2, Inserting.insert(array, 3));
	}
}
