import java.util.Scanner;

public class Popular {
	public static void main(String[] args) {
		Popular p = new Popular();
		try {
			p.hipThings();
		} catch (OutOfStyleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotCoolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String hipThings() throws NotCoolException, OutOfStyleException {
		String string = "";
		Scanner s = new Scanner(System.in);
		String input = s.next();
		if (input.equals("damn daniel")) {
			System.out.println("get out >:(");
		} else {
			throw new NotCoolException("cool :) :) :) :) :) :) :) :) :) :) :) :) :) ) :) :) :) :) :)");
		}
		return string;
	}
}
