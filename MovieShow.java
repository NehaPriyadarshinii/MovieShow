package movieShow;

public class MovieShow {

	public static void main(String[] args) {
		MovieShow mv = new MovieShow();
		mv.calculate();
	}

	public void calculate() {
		int count = 0;
		int temp;
		int[] movieStrt = { 8, 7, 6, 10, 10, 12, 13, 14, 15, 16 };
		int[] movieEnd = { 9, 8, 9, 11, 12, 16, 14, 15, 16, 17 };
		for (int var1 = 0; var1 < 10; var1++) {
			for (int var2 = 0; var2 < 9; var2++) {
				if (movieStrt[var2] > movieStrt[var2 + 1]) {
					temp = movieStrt[var2];
					movieStrt[var2] = movieStrt[var2 + 1];
					movieStrt[var2 + 1] = temp;
					temp = movieEnd[var2];
					movieEnd[var2] = movieEnd[var2 + 1];
					movieEnd[var2 + 1] = temp;
				}

			}
		}

		for (int number : movieStrt) {
			System.out.print(number + " ");
		}
		System.out.println();
		for (int number : movieEnd) {
			System.out.print(number + " ");
		}
		System.out.println();

		int watched = 0;
		System.out.println("start:" + movieStrt[watched] + "\t\t end:" + movieEnd[watched]);
		count = 1;

		for (int moviNum = 1; moviNum < 10; moviNum++) {

			if (movieEnd[watched] <= movieStrt[moviNum]) {
				count++;
				watched = moviNum;
				System.out.println("start:" + movieStrt[watched] + "\t\t end:" + movieEnd[watched]);

			}
		}

		System.out.println("count=" + count);
	}
}
