public class ThePuzzles {
	public static void main(String[] args) {
		new ThePuzzles().money(Integer.parseInt(args[0]),
				Integer.parseInt(args[1]));
		new ThePuzzles().zebra();
		new ThePuzzles().pizza(Integer.parseInt(args[2]),
				Integer.parseInt(args[3]));
	}

	private void pizza(int slices, int end) {
		// TODO Auto-generated method stub
		int times = 0;
		while (slices > end) {
			times++;
			slices = slices / 2;
			System.out.println(slices);
		}
		System.out.println("3. " + times);
	}

	private void zebra() {
		// TODO Auto-generated method stub
		boolean run = true;
//		while (run = true) {
//			System.out.println("Black");
//			System.out.println("White");
//		}
	}

	private void money(int dollars, int goal) {
		// TODO Auto-generated method stub
		int years = 0;
		while (dollars < goal) {
			years++;
			dollars = dollars * 2;
		}
		System.out.println("1. " + years);
	}
}
