package problem2;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + " ");

			if (i % 3 == 0) {
				System.out.print("Fosbury");
			}
			if (i % 5 == 0) {
				System.out.print("Flop");
			}
			System.out.println();
		}

	}

}
