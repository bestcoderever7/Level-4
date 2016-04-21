import java.util.ArrayList;

public class BinarySort {
	public static void main(String[] args) {
		BinarySort bs = new BinarySort();
		bs.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		array = binarySort(array, 5);
		for (int i : array) {
			System.out.println(i);
		}
	}

	private int[] binarySort(int[] array, int j) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++)
		{
			sorted.add(array[i]);
		}
		int index = 0;
		int[] primitive = new int[array.length];
		int sorter = 0;
		boolean stop = false;
		for (int i = 0; i < array.length; i++) {
			sorter = sorted.get((sorted.size() - 1) / 2);
			while (stop == false) {
				if (j < sorted.get(sorter)) {
					sorter = sorted.get(sorter / 2);
				} else if (j == sorted.get(sorter)) {
					sorted.add(sorter, j);
					stop = true;
				} else {
					sorter = sorted.get(sorter + (sorter / 2));
				}
			}
		}
		index = 0;
		for (int i : sorted) {
			primitive[index] = i;
			index++;
		}
		return primitive;
	}
}
