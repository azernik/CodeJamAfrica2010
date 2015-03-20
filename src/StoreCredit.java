import java.util.Scanner;

public class StoreCredit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreCredit storeCredit = new StoreCredit();

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // number of test cases

		for (int n = 1; n <= N; n++) {

			int C = sc.nextInt(); // number of credit
			int I = sc.nextInt(); // number of items
			int[] P = new int[I]; // array of prices

			// populate the array
			for (int x = 0; x < I; x++) {
				P[x] = sc.nextInt();
			}

			String result = storeCredit.solve(C, I, P);
			System.out.format("Case #%d: %s%n", n, result);
		}

		sc.close();
	}

	public String solve(int credit, int numItems, int[] prices) {

		for (int i = 0; i < numItems; i++) {
			for (int j = i + 1; j < numItems; j++) {
				
				if (prices[i] + prices[j] == credit) {
					return String.format("%d %d", i + 1, j + 1);
				}
			}
		}
		
		return "Failed";
	}
}
